#!/bin/bash

# Define the expected output
expected_output="In Barcode constructor
In Product constructor
Product{id=1, name='Tumbler', barcode='|?|?||????|'}
Product{id=2, name='Bucket', barcode='|?????|||??|'}"

# Run the JAR file and capture the output
cd ex3 && mvn clean install
actual_output=$(java -jar target/store-management-1.0-SNAPSHOT.jar)

# Compare the output
if [ "$actual_output" == "$expected_output" ]; then
  echo "Test Passed: Output matches the expected result."
else
  echo "Test Failed: Output does not match."
  echo "Expected: $expected_output"
  echo "Actual:   $actual_output"
  exit 1
fi
