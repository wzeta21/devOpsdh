# Maven

1. docker build -t my-maven .
2. docker run -it -d --name cmaven my-maven:latest
3. docker exec -it xxx bash
4. mvn --version

docker run -it -d --name cmaven -p 8080:8080 -v $(pwd)/mixer2-sample:/root/ my-maven:latest <--