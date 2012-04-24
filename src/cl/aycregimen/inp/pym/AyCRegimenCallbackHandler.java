
/**
 * AyCRegimenCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

    package cl.aycregimen.inp.pym;

    /**
     *  AyCRegimenCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AyCRegimenCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AyCRegimenCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AyCRegimenCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for proc_faj_sps method
            * override this method for handling normal response from proc_faj_sps operation
            */
           public void receiveResultproc_faj_sps(
                    cl.aycregimen.inp.pym.AyCRegimenStub.Proc_faj_spsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from proc_faj_sps operation
           */
            public void receiveErrorproc_faj_sps(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for proc_elegibilidad_sps method
            * override this method for handling normal response from proc_elegibilidad_sps operation
            */
           public void receiveResultproc_elegibilidad_sps(
                    cl.aycregimen.inp.pym.AyCRegimenStub.Proc_elegibilidad_spsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from proc_elegibilidad_sps operation
           */
            public void receiveErrorproc_elegibilidad_sps(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fn_hijos_bph method
            * override this method for handling normal response from fn_hijos_bph operation
            */
           public void receiveResultfn_hijos_bph(
                    cl.aycregimen.inp.pym.AyCRegimenStub.Fn_hijos_bphResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fn_hijos_bph operation
           */
            public void receiveErrorfn_hijos_bph(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for proc_situacion_actual method
            * override this method for handling normal response from proc_situacion_actual operation
            */
           public void receiveResultproc_situacion_actual(
                    cl.aycregimen.inp.pym.AyCRegimenStub.Proc_situacion_actualResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from proc_situacion_actual operation
           */
            public void receiveErrorproc_situacion_actual(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consulta_documentos method
            * override this method for handling normal response from consulta_documentos operation
            */
           public void receiveResultconsulta_documentos(
                    cl.aycregimen.inp.pym.AyCRegimenStub.Consulta_documentosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consulta_documentos operation
           */
            public void receiveErrorconsulta_documentos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fn_elegibilidad_bph method
            * override this method for handling normal response from fn_elegibilidad_bph operation
            */
           public void receiveResultfn_elegibilidad_bph(
                    cl.aycregimen.inp.pym.AyCRegimenStub.Fn_elegibilidad_bphResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fn_elegibilidad_bph operation
           */
            public void receiveErrorfn_elegibilidad_bph(java.lang.Exception e) {
            }
                


    }
    