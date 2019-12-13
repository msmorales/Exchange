Spring-Boot Camel

#Instalar

mvn clean install

#Crear secrets

oc create -f secret.yml

#Crear Propiedades***********Por favor verfifique los valos correspodientes a su ambiente

oc create configmap logscentralizados --from-literal=quickstart.endpoint_Path="/ElasticSearch" --from-literal=quickstart.urlBroker="tcp://broker-amq-headless.proyectopagos-dev.svc.cluster.local:61616" --from-literal=quickstart.TimeOutBroker="3000" --from-literal=quickstart.urlElasticSearch="localhost:9200" --from-literal=quickstart.codigoRespuesta_ErrorGeneral="500" --from-literal=quickstart.codigo_ErrorEstructura="500" --from-literal=quickstart.descripcion_ErrorEstructura="Error en estructura de la peticion" --from-literal=quickstart.codigo_ErrorInterno="500" --from-literal=quickstart.descripcion_ErrorInterno="Error interno del servicio" --from-literal=quickstart.codigo_ErrorProveedor="500" --from-literal=quickstart.descripcion_ErrorProveedor="Error al ejecutar procedimiento almacenado" --from-literal=quickstart.codigo_ErrorTimeOut="500" --from-literal=quickstart.descripcion_ErrorTimeOut="Error de Time Out" --from-literal=quickstart.codigo_ErrorProcedure="500" --from-literal=quickstart.descripcion_ErrorProcedure="Error al ejecutar procedimiento almacenado" --from-literal=quickstart.userElasticSearch="elastic" --from-literal=quickstart.passwordElasticSearch="gnmg6f97fq2vzsgmk5c8ch5x"

#Desplegar en OpenShift
mvn clean -DskipTests fabric8:deploy -Popenshift

#To list all the running pods:

oc get pods
Log oc logs