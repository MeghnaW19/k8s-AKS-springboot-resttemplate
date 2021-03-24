## Exercise: Deploy a Spring Boot microservices application that communicates synchronously through RestTemplate on K8s Cluster in Azure AKS.


* In this exercise, you will deploy a Spring Boot microservices application communicating synchronously using RestTemplate on Azure AKS.


 
This exercise contains:

	- quotation-service - A Spring Boot RESTful service that generates random quotes.
	- quotation-client-service - A Spring Boot RESTful service which consumes the `quotation-service` RESTful Web Service.
	- k8-manifests - A folder that contains manifest files
	

This exercise contains the following files in k8-manifests folder:  

	- configmap.yml - To define a ConfigMap.
	- quotation.yml - To create a Service of type `LoadBalancer` for `quotation-service` microservice.
	- quotationclient.yml - To create a Service of type `LoadBalancer` for `quotation-client-service` microservice.
  

**Note**: You need to go through the comments thoroughly and complete the application. 

Understand and perform following steps to complete the exercise:
  
	
	1. Verify that the AKS cluster is created and ready.
	2. Build and push quotation-service image to Docker Hub.
	3. Implement `quotation.yml` to define Deployment, a Service of type LoadBalancer.
	4. Test the quotation-service, open browser and access `<external-ip-of-quotation-service>:<port>/api/v1/quotation` url.
	5. Implement `configmap.yml` to define ConfigMap by defining a key with value as `<external-ip-of-quotaion-service>:<port>/api/v1/quotation`.
	6. Implement `quotationclient.yml` to create a Service.
	7. Test the quotaion-client-service is consuming the message from quotaion-service. To do so, open the browser and access `<external-ip-of-quotation-client-service>:<port>/api/v1/message`.

### Instructions

- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Ensure your code compiles without any errors/warning/deprecations
- Follow best practices while coding
