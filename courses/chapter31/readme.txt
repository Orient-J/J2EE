RMI ?
General RMI Architecture ?
Parts in RMI Architecture ?
Stub File
RMI Registry 
Steps for Developing RMI Application
Example RMI Application

========================================================================

RMI = Remote Method Invocation for distributed application 

an object from a JVM access/invoke an object from other JVM

To hide low level detail 

========================================================================

Parts in RMI Architecture

Server 

    . create remote objs 
    . make references making remote objs accessible
    . wait clients which invoke methods on these objs

Client 
    
    . get a references to one/more remote objs
    . invoke methods from these objs

Stub 

    .marshals argument data = serialization 
    .unmarshals result data = deserialization 

==========================================================================

The Stub 

.Functions In Client Side

1.sending remote call to server side stub 
2.opening socket to the remote server 
3.marshaling the object parameters and forwarding the data stream to the server side 

.Functions In Server Side 

1.contains a method to receive remote calls
2.unmarshals the parameters
3.invokes actual remote obj implementation
4.marshaling the result and sending back the data stream to Client Side 

===========================================================================

RMI Registry 

a naming service 

initiated using java's rmiregistry tool 

register remote objs with rmiregistry using bind()/rebind() methods 

a unique name be used to register , bind name 

client program lookup obj references matching bind name from registry using lookup() method 

Registry name format :: 

rmi::/<host_name>:<port_number>/<bind_name>


===========================================================================


Steps for Developing RMI Application 


1. Define Remote Interface 

2. Develop Remote Object by implementing to Remote Interface 

3. Develop Client Program

4. Complilation 

5. Deployment 

===========================================================================


Exceptions 

RemoteException ( java.rmi.* )
MalformedURLException ( java.net.* )
NotBoundException ( java.rmi.* )