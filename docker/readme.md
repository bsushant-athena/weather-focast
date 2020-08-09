#Steps to build the image
1)copy jar file inside docker folder
2)./build.sh

#Steps to push image to artifactory
docker tag weatherapp-local sam91265/test:weatherapp-local
docker push sam91265/test:weatherapp-local

#Images pushed available here
https://hub.docker.com/layers/sam91265/test/weatherapp-local/images/

#Run using docker image
docker run -p 8081:8081 weatherapp-local:1.0.0