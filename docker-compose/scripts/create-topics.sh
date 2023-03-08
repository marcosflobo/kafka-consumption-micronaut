echo "Waiting for Kafka to come online..."

cub kafka-ready -b kafka:9092 1 20

# create the desired-state-events topic
kafka-topics \
  --bootstrap-server kafka:9092 \
  --topic bcs_events \
  --replication-factor 1 \
  --partitions 6 \
  --create

sleep infinity