# OBD Simulator #

On-board diagnostics (OBD) is an automotive term referring to a vehicle's self-diagnostic and reporting capability.
This app will simulate a WiFi OBD dongle, allowing development of companion mobile apps, without the need to sit in your car!

* Creates a TCP socket on your machine on port 35000. 
* Currently will only simulate wifi connections, we need to figure out how to add bluetooth functionality.

## How do I get set up? ##

* You need to install java 7 jdk
* Maven is used to download dependencies and build
* Developed in IntelliJ Comminity Edition

## How to test it? ##

You can use Netcat to talk with the simulator:

```
nc -vt 'your ip' 35000
```

## Supported PIDS ##

Currently the simulator supports these OBD PIDS:

* 0B - Intake Manifold Absolute Pressure

full list of pids can be viewed on wikipedia - http://en.wikipedia.org/wiki/OBD-II_PIDs#Mode_01
