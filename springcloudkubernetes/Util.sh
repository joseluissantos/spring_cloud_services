#!/bin/bash

echo "Borramos los servicios existentes\n"
kubectl delete service demokubernete-frontend
kubectl delete service demokubernete-backend

echo "Borramos los despliegues existentes\n"
kubectl delete deployment demokubernete-backend
kubectl delete deployment demokubernete-frontend

echo "Creamos la imagen de docker de demokubernete-backend"
docker build -t demobackend /home/oracle/git_repo/spring_cloud_services/demokubernete-backend

echo "Creamos la imagen de docker de demokubernete-frontend"
docker build -t demofrontend /home/oracle/git_repo/spring_cloud_services/demokubernete-frontend

#Crear deployment y servicio a partir de fichero
echo "Creando deployment y service"
kubectl create -f backend-deployment.yml
kubectl create -f frontend-deployment.yml 

echo "Arrancando service"
minikube service demokubernete-frontend
