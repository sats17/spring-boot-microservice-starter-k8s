#!/bin/bash

# Define the service name
service_name="starter-service"

# Get the pod names associated with the service
pod_names=$(kubectl get endpoints "$service_name" -o=jsonpath='{.subsets[*].addresses[*].ip}' | tr ' ' '\n' | kubectl get pods --template '{{range .items}}{{.metadata.name}}{{"\n"}}{{end}}')

# Iterate through each pod and make the HTTP call
for pod_name in $pod_names; do
  # Make the HTTP call to the Spring Boot application inside the pod
  echo "Refreshing configuration for pod: $pod_name"
  kubectl exec "$pod_name" -- curl --location --request POST 'http://localhost:8081/actuator/refresh'
done
