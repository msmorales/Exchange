Spring-Boot Camel

#Instalar

mvn clean install

#Crear secrets

oc create -f secret.yml

#Crear Propiedades***********Por favor verfifique los valos correspodientes a su ambiente

oc create configmap apivoucher --from-literal=quickstart.endpoint_SaldoEncargos_Path="/voucher" --from-literal=quickstart.urlBroker="tcp://broker-amq-tcp.proyectopagos-test.svc.cluster.local:61616" --from-literal=quickstart.TimeOutBroker="3000" --from-literal=quickstart.jdbcConnection_Oracle="jdbc:oracle:thin:@172.16.0.230:1521:fidudesa" --from-literal=quickstart.jdbcUserName_Oracle="INT_WS" --from-literal=quickstart.jdbcPassword_Oracle="sistemas" --from-literal=quickstart.urlEndpoint_servie="apivoucher-proyectopagos-test.cloudappsdesa.fiduprevisora.loc/fxf/ordenPago/registrarOrdenPago" --from-literal=quickstart.codigoRespuesta_ErrorGeneral="500" --from-literal=quickstart.codigo_ErrorEstructura="500" --from-literal=quickstart.descripcion_ErrorEstructura="Error en estructura de la peticion" --from-literal=quickstart.codigo_ErrorInterno="500" --from-literal=quickstart.descripcion_ErrorInterno="Error interno del servicio" --from-literal=quickstart.codigo_ErrorProveedor="500" --from-literal=quickstart.descripcion_ErrorProveedor="Error de conexion con el proveedor" --from-literal=quickstart.codigo_ErrorTimeOut="500" --from-literal=quickstart.descripcion_ErrorTimeOut="Error de Time Out" --from-literal=quickstart.descripcion_ErrorProcedure="Error al ejecutar procedimiento almacenado" --from-literal=quickstart.wsdlConsume_voucher="grecia.fiduprevisora.com.co:8340/PSIGW/PeopleSoftServiceListeningConnector" --from-literal=quickstart.query_user_key="user_key" --from-literal=quickstart.query_value="f7f279e89ee2c8ff9d742070af6a9f63"

#Desplegar en OpenShift
mvn clean -DskipTests fabric8:deploy -Popenshift

#To list all the running pods:

oc get pods
Log oc logs