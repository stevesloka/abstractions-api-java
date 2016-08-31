# Makefile for the Docker image stevesloka/abstractions-api
# MAINTAINER: Steve Sloka <steve@stevesloka.com>
# If you update this image please bump the tag value before pushing.

.PHONY: all build container push clean test

TAG = us9988addsched
PREFIX = stevesloka

all: container

build:
	./gradlew clean build

container: build
	docker build -t $(PREFIX)/abstractions-api:$(TAG) .

push:
	docker push $(PREFIX)/abstractions-api:$(TAG)

clean:
	rm -f restapi

test: clean
	godep go test -v --vmodule=*=4
