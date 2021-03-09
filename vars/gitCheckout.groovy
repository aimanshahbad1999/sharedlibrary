#!/usr/bin/env groovy

def call(String gitUrl){

    checkout([$class: 'GitSCM',
    branches: [[name: '*/master']],
    userRemoteConfigs: [[url: gitUrl]]])


}