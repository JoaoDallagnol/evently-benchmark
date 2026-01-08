#!/bin/bash
awslocal sqs create-queue --queue-name tickets-java
awslocal sqs create-queue --queue-name tickets-bun
awslocal sqs create-queue --queue-name tickets-go
awslocal sqs create-queue --queue-name tickets-elixir