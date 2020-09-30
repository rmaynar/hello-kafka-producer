# Hello Kafka Producer

Springboot + Kafka producer simple example

## Running Zookeper

Under kafka installation folder

```bash
bin/zookeeper-server-start.sh conf/zookeeper.properties
```

## Running Kafka server

```bash
bin/kafka-server-start.sh config/server.properties
```

## Running a consumer
Topic 'globant_topic' is used for the example

```bash
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic globant_topic --from-beginning
```