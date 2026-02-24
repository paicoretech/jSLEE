# jSLEE

jSLEE is an open-source Java implementation of the **JAIN SLEE (Service Logic Execution Environment)** specification, providing a scalable, event-driven application server for telecom and signaling platforms. It offers a robust component model and a fault-tolerant execution environment designed to support carrier-grade services and protocol integrations.

JAIN SLEE specification constitutes the JAVA community framework for the high standards in terms of performance, availability, portability, scalability, robustness, event oriented execution logic, etc., suitable for services/applications inter-working within telecommunication networks.

JAIN SLEE architecture, through its Resource Adaptors (RA), adjusts information from peripheral agents of the SLEE, namely: Mobile Switching Centre Servers (MSC/MSCS), Media Gateways (MGW, MGC/MGCF), Signaling Gateways (SGW), Mobility Management Entities (MME), SIP servers/proxies like Serving/Interrogating/Proxy-Call Session Control Functions (S-CSCF, I-CSCF, P-CSCF), Media Resource Function Control, mobile subscribers database query to HSS/HLR through Diameter/MAP respectively, Signaling Control Points (SCP) through CAP/INAP, and other service protocols like SOAP (Simple Object Access Protocol), OSA/Parlay, LDAP (Lightweight Directory Access Protocol), JDBC (Java Data Base Connectivity), JPA (Java Persistence API), etc.

The components that carry out logic implementation of services/applications according to JAIN SLEE are named Service Building Blocks or SBB. The SBB are executed within a «components container», which controls their life cycle and eases their composition. An SBB may comprise multiple child SBBs, which are also reusable for other services, encompassing Java code usually generated in a dynamic Service Creation Environment (SCE) or middleware platforms containing JAIN SLEE SBBs.

JAIN SLEE service developer undergoes SBB construction by gathering logic items which represent events during the process of a service. As JAIN SLEE has been specially designed for event oriented logic execution, services are initiated by events like Diameter Requests/Answers. The generated SBBs then act together with the RAs under the JAIN SLEE framework to provide service to diverse external entities.  Every arriving event at the SLEE through the RAs is distributed among the SBBs in order to process them. This functionality is carried out by the «event router» as it is named within the functional structure of the JAIN SLEE framework.

This repository is maintained and published as open source by **PAiCore Technology**.
For more information, visit **https://paicore.tech**.

---

## Features

- Event-driven execution model compliant with JAIN SLEE concepts  
- Scalable and fault-tolerant runtime architecture  
- Component-based service development model  
- Designed for high-throughput telecom environments  

---

## Protocol & Network Integration

jSLEE is commonly integrated through a wide range of telecom protocols such as:

- SS7 (MAP / CAP / TCAP / INAP / ISUP)
- Diameter
- SIP  
- SMPP  
- HTTP / XCAP / XDM  
- XMPP  
- MGCP  

Additional protocol enablers can be integrated through Resource Adaptors.

---

## Build Prerequisites

- Java 11 (OpenJDK recommended)  
- Maven 3.x  

---

## Build from Source

```bash
git clone https://github.com/paicoretech/jSLEE.git
cd jSLEE
mvn clean install
```

---

## License

This project is licensed under the **GNU General Public License v3.0 (GPL-3.0)**.  
See the [LICENSE](LICENSE) file for details.
