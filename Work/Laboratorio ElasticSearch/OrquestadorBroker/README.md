Spring-Boot Camel

#Instalar

mvn clean install

#Crear secrets

oc create -f secret.yml

#Crear Propiedades***********Por favor verfifique los valos correspodientes a su ambiente

oc create configmap orquestadorbroker --from-literal=quickstart.endpoint_Path="/OrquestadorBroker" --from-literal=quickstart.urlBroker="tcp://broker-amq-headless.proyectopagos-dev.svc.cluster.local:61616" --from-literal=quickstart.TimeOutBroker="3000" --from-literal=quickstart.urlElasticSearch="localhost:9200"

#Desplegar en OpenShift
mvn clean -DskipTests fabric8:deploy -Popenshift

#To list all the running pods:

oc get pods
Log oc logs