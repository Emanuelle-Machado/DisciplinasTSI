# 1 Internet Banking System

![diagram](https://www.plantuml.com/plantuml/svg/0/fPHDRzim38Rl_XLS3aCAkCsbfvtQfi6Q8cc3EbsxKq7BJAnLbWoHJbeC---3vCHrFxOTTZ94lIGVKgHFMD1BKvdaaxRAD0L1ALBpbz78u_PehQLiyeR9AsU5h1mfLusmy1hjnZHrCneV7ouCMhcTpqO6XLX6u-E7iRE2sf8_gaFiP7Rw_Vfs-N0tNLuyp2PV9rVdmuCaMP1dPuTrhb8Oj0SqS8RsKTirZ1iMLv4Vf30u1RKxWLk1b0GvsiSKjbfAgFUUmGQeb6kiyD7W8CcUMQXwc3p9a3Y5mUImGcs0epd4NPO4sWhvu3xNoZjsAu79aohHhWcex_0cOfM7a7FKTkMneeuxww9duZmne35xQkLyYnw4sgwShr2qiu2vQwGhajEkZ1J4esLKGSOfaAWUnvbhR87-UQWZp3IMGh9d6Hp0pmG0e7kFuHPJ6DnH3gTrRRIAsGFh3zmWe2qWgts0ctyR1_Cv6RqXpv6U1KKhs8r2L4lNG9AkCDPsRGXgN1FWIvh0_Hg6wq2JjV95a7z0nShhkis6TjqOZ1Eny6wZYrrtFwHODJOs3OsMPn3tqbtOQ0m-siEMSiYzspBvztXLe9kxN9i85jBUOuLUszS4O7IbXGhW9cSISF8VH5MRR_SfQACLlKShyl0uA9WZKw2v8ODjRDYR8LCbLTYRnB38u6cjMNmxTxqPJA54Bga0RAGaAxjd0EMf24SqxLWICnYtVfd5rsHOwx2mY-cV9qpw4zQryH_j2Xr2kCokhqONo-K2JXVJa3nclo7JverRdf4jUBUw7AkVBnSxpaxPRkyjKrJSpsSnQlPM5ljyGrWmV8Qjrq8CueBBvVdPkASEUzMEytvbUfVnectCFcDNI3zbzNVPhoG9glY_Z7kyL-q5tMrB4gzxrkgDCNIh_Vc-Qbaey20v8Lk4V_Tl)

**Level 2: Container diagram**

Once you understand how your system fits in to the overall IT environment, a really useful next step is to zoom-in to the system boundary with a Container diagram. A "container" is something like a server-side web application, single-page application, desktop application, mobile app, database schema, file system, etc. Essentially, a container is a separately runnable/deployable unit (e.g. a separate process space) that executes code or stores data.

The Container diagram shows the high-level shape of the software architecture and how responsibilities are distributed across it. It also shows the major technology choices and how the containers communicate with one another. It's a simple, high-level technology focussed diagram that is useful for software developers and support/operations staff alike.

**Scope**: A single software system.

**Primary elements**: Containers within the software system in scope.
Supporting elements: People and software systems directly connected to the containers.

**Intended audience**: Technical people inside and outside of the software development team; including software architects, developers and operations/support staff.

**Notes**: This diagram says nothing about deployment scenarios, clustering, replication, failover, etc.