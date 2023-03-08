# Hello Kafka Consumer


## Set up Kafka cluster
### Run Kafka cluster locally
```shell
docker-compose up
```

### List Kafka topics
```shell
docker-compose exec kafka kafka-topics --list --bootstrap-server kafka:29092
```

### Produce messages in Kafka topic
```shell
 docker-compose exec kafka bash -c "
  kafka-console-producer \
  --bootstrap-server kafka:9092 \
  --topic my_events \         
  --property 'parse.key=true' \
  --property 'key.separator=:' < messages.txt"
```
**Note**: You can run this every time you want the service read messages (even though are the same always)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature kafka-streams documentation

- [Micronaut Kafka Streams documentation](https://micronaut-projects.github.io/micronaut-kafka/latest/guide/index.html#kafkaStream)

## Feature kafka documentation

- [Micronaut Kafka Messaging documentation](https://micronaut-projects.github.io/micronaut-kafka/latest/guide/index.html)

## Feature test-resources documentation

- [Micronaut Test Resources documentation](https://micronaut-projects.github.io/micronaut-test-resources/latest/guide/)


## Kafka
- https://hevodata.com/learn/kafka-console-producer/

