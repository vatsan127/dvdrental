#!/bin/bash

echo "Stopping Running Container: $(docker stop dvdrental-svc)"
echo "Deleting Existing Container: $(docker rm dvdrental-svc)"

mvn clean install -DskipTests
mkdir -p target/dependency
cd target/dependency && jar -xf ../*.jar && cd -

TIMESTAMP=$(date +"%Y%m%d%H%M%S")
echo "Tagging Old Binary with: $TIMESTAMP"

docker build -t dvdrental:$TIMESTAMP .

#docker run --name transaction -p 8080:8080 -e DB_HOST=postgres --network database -d dvdrental:$TIMESTAMP
docker run --name dvdrental-svc --network=host -d dvdrental:$TIMESTAMP

#Use below command to login as root user
#docker exec -u 0 -it dvdrental-svc sh