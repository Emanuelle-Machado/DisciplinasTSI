# 2 Deployment

![diagram](https://www.plantuml.com/plantuml/svg/0/rLRVRnev47xdhvZRbmlH1XeKdQe-bK2l9Ge1PKbp9vqKpTh3hYzUsx9deRbJ__UJTw50IgMcVJeUa3tu6y_tpG_pDZ1whYlT-KKPeMj9K3AxyARVzxZk5OhBEgy3UM4Da-6Ui5KVfLTeLhfsTNzqSJRNQFXkUjtNo1IuFxfu69FJzgcA01UTTww7Vyxk5W_tayM7X-jtxz_TZ4-wdSxksCEDbNJYj4WXkLG5NA9v1AT5ycmF4Xb1a67oIVVV3W30So_If93agiZHF9wXKwUdft_nfzVHrLrU6wxX_BVUgmkuNcHR5yVSe4DHKWh9i5d0mbO2ENbkWDUzJ_jkucTa3QCov4_GgGYOJs3ed5O2MLaJVLpX2W6DXCnvPGgOVXn5yzpRbP8KO18P6kA6UJomh8s8ODIAds2b412kijbD_yDYCSzWE9_qakwNA3vtTj_FYMsaaVchypsXulQb4bcFGaU9Piq2pc3kLON-ATdPpWVYc_ACynEPfv2CaJ77G15sInfRdh0rGoPAgZ3-ch7r521M97WgL63Vd0PbbjPNpJg54aD94h3caWnlL0VXISOjwf022a4XWBP5I85Ol5oymQ5uWnyJRx2lNaR26lb2_GR_Cm7pVU7MbBVjUV5ZxJduoVvSKwo_Uyg_ip_7fDMAV00k2G8ZAm6RqTYSZkQlMZSeKsW2XmK1xguvfjZdhuTYPME8epgmhSZ_6g2okT84abPAKClNQOB9B0FhOMYajqfkAU-ejh0KaccB7peNmNzWXLwPW-63e5Mbc2I4EW_4O9V7cHqE9ROWDc66Pa9nISeVnXj97o4fREKEMKPB7QTyZ5XvOODTCjmh8-qwn81QrXMAMVQjbo3tTXt8Rp9ysUwYm_VMneoCIcyhIc5g_r5Q8_okF2tjGRdiz0iEO_-qkPp7N1ufcKnuvTfI69gYrkWFXTNwvxHSKmuRLjloQOhcblIN1BTlpXGVASHd0GHg7O1jZEJlO4txOYJT1jImUX6YQPbMZ5qts8QJsALlBz0Dhhca6VUtX3B0qjkg4Mhj5TFskglnvUWGCFX-HFI-1RIfeT3-Os2RT3kTjsHaNUd_0000)

**Deployment diagram**

A deployment diagram allows you to illustrate how containers in the static model are mapped to infrastructure. This deployment diagram is based upon a UML deployment diagram, although simplified slightly to show the mapping between containers and deployment nodes. A deployment node is something like physical infrastructure (e.g. a physical server or device), virtualised infrastructure (e.g. IaaS, PaaS, a virtual machine), containerised infrastructure (e.g. a Docker container), an execution environment (e.g. a database server, Java EE web/application server, Microsoft IIS), etc. Deployment nodes can be nested.

**Scope**: A single software system.

**Primary elements**: Deployment nodes and containers within the software system in scope.

**Intended audience**: Technical people inside and outside of the software development team; including software architects, developers and operations/support staff.