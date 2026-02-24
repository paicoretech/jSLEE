# jSLEE

jSLEE is an open-source Java implementation of the **JAIN SLEE (Service Logic Execution Environment)** specification, providing a scalable, event-driven application server for telecom and signaling platforms.

It offers a robust component model and a fault-tolerant execution environment designed to support carrier-grade services and protocol integrations.

This repository is maintained and published as open source by **PAiCore Technologies**.  
For more information, visit **https://paicore.tech**.

---

## Features

- Event-driven execution model compliant with JAIN SLEE concepts  
- Scalable and fault-tolerant runtime architecture  
- Component-based service development model  
- Designed for high-throughput telecom environments  

---

## Protocol & Network Integration

jSLEE is commonly integrated with a wide range of telecom protocols and network elements, including:

- SS7 / MAP / CAP / TCAP / INAP / ISUP  
- SIP  
- SMPP  
- HTTP / XCAP / XDM  
- XMPP  
- MGCP  

Additional protocol enablers can be integrated through resource adaptors.

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
