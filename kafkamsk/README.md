# Start Docker

> docker-compose up -d

## create topic

docker exec docker_kafka_1 kafka-topics --bootstrap-server localhost:9092 --create --topic quickstart

## list topics

docker exec docker_kafka_1 kafka-topics --bootstrap-server localhost:9092 --list

## produce message

docker exec --interactive --tty docker_kafka_1 kafka-console-producer --bootstrap-server localhost:9092 --topic quickstart

## consume message

docker exec --interactive --tty docker_kafka_1 kafka-console-consumer --bootstrap-server localhost:9092 --topic quickstart --from-beginning

## curl

> curl --location --request POST 'localhost:9000/produces/publish?message=produces a message'