In this program, there is a SERVER that several CLIENTS can connect to. CLIENTS can speak to one another with one to one messaging.
They can speak to multiple CLIENTS at once. They can broadcast messages across all clients. They can disconnect from the SERVER. 

A CLIENTHANDLER manages the traffic between the CLIENT sends. A SERVERHANDLER manages traffic from the CLIENT and the SERVER.

The SERVER does not interact with the CLIENTS within the SERVER window.

Each CLIENT has their own text window. This text window will show their outgoing messages and received messages. Messages sent
between CLIENTS will only be visible to the participants on either end of the message.