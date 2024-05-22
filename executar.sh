#!/bin/bash

for jar in *.jar; do
  java -jar "$jar" &
done