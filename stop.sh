#!/bin/bash

JAR_PID=$(pgrep -f test-java-engine)

kill -9 "$JAR_PID"
