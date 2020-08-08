#!/bin/sh

/usr/bin/java -server -XX:MaxRAM=512m -XX:MaxRAMFraction=2 -XX:+UseParallelOldGC \
    -XX:+UnlockExperimentalVMOptions \
    -XX:+UseCGroupMemoryLimitForHeap \
    -XX:+PrintFlagsFinal \
    -XX:+HeapDumpOnOutOfMemoryError \
	-jar /usr/local/weatherapp/weatherapp.jar
