Spring-Boot Camel

#Instalar

mvn clean install

#Crear secrets

oc create -f secret.yml

#Crear Propiedades***********Por favor verfifique los valos correspodientes a su ambiente

oc create configmap crearasientocf --from-literal=quickstart.endpoint_crearAsientoCF_Path="/crearAsientoCF" --from-literal=quickstart.urlBroker="tcp://broker-amq-headless.proyectopagos-dev.svc.cluster.local:61616" --from-literal=quickstart.TimeOutBroker="3000" --from-literal=quickstart.urlEndpoint_servie="crearasientocf-proyectopagos-dev.cloudappsdesa.fiduprevisora.loc/fxf/crearAsientoCF/crearAsientoCF" --from-literal=quickstart.codigoRespuesta_ErrorGeneral="500" --from-literal=quickstart.codigo_ErrorEstructura="500" --from-literal=quickstart.descripcion_ErrorEstructura="Error en estructura de la peticion" --from-literal=quickstart.codigo_ErrorInterno="500" --from-literal=quickstart.descripcion_ErrorInterno="Error interno del servicio" --from-literal=quickstart.codigo_ErrorProveedor="500" --from-literal=quickstart.descripcion_ErrorProveedor="Error de conexion con el proveedor" --from-literal=quickstart.codigo_ErrorTimeOut="500" --from-literal=quickstart.descripcion_ErrorTimeOut="Error de Time Out" --from-literal=quickstart.descripcion_ErrorProcedure="Error al ejecutar procedimiento almacenado" --from-literal=quickstart.wsdlConsume_voucher="grecia.fiduprevisora.com.co:8340/PSIGW/PeopleSoftServiceListeningConnector" --from-literal=quickstart.query_user_key="" --from-literal=quickstart.query_value="" --from-literal=quickstart.wsdlConsume_abonos="grecia.fiduprevisora.com.co:8340/PSIGW/PeopleSoftServiceListeningConnector" --from-literal=quickstart.urlElasticSearch="localhost:8088/log/OrquestadorBroker/enviarLog"

#Desplegar en OpenShift
mvn clean -DskipTests fabric8:deploy -Popenshift

#To list all the running pods:

oc get pods
Log oc logs