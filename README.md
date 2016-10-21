# CUBA example for (temporal-) reference data

In this example you can see different options on how to work with reference data.
This example includes:

* soft deletion
* temporal reference data
* tenant-based blacklisting for reference data entries

The soft delete feature of the platform of reference data is used so that they be accessed in transaction data even if the reference was already deleted.

The temporal reference data is used through validFrom and validUntil properties of a reference so that only reference data can be accessed that is valid at the given point in time but be displayed even if the validity of a certain reference data entry is already expired.

## Entity model
![Entity model](domain-model-temporal-reference-data.png?raw=true "Entity model")
