# V1 Locations

```java
V1LocationsApi v1LocationsApi = client.getV1LocationsApi();
```

## Class Name

`V1LocationsApi`

## Methods

* [Retrieve Business](/doc/v1-locations.md#retrieve-business)
* [List Locations](/doc/v1-locations.md#list-locations)

## Retrieve Business

Get the general information for a business.

---

- __Deprecation date__: 2019-11-20
- [__Retirement date__](https://developer.squareup.com/docs/build-basics/api-lifecycle#deprecated): 2020-11-18
- [Migration guide](https://developer.squareup.com/docs/migrate-from-v1/guides/v1-locations)

---

```java
CompletableFuture<V1Merchant> retrieveBusinessAsync()
```

### Response Type

[`V1Merchant`](/doc/models/v1-merchant.md)

### Example Usage

```java
v1LocationsApi.retrieveBusinessAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## List Locations

Provides details for all business locations associated with a Square
account, including the Square-assigned object ID for the location.

---

- __Deprecation date__: 2019-11-20
- [__Retirement date__](https://developer.squareup.com/docs/build-basics/api-lifecycle#deprecated): 2020-11-18
- [Migration guide](https://developer.squareup.com/docs/migrate-from-v1/guides/v1-locations)

---

```java
CompletableFuture<List<V1Merchant>> listLocationsAsync()
```

### Response Type

[`List<V1Merchant>`](/doc/models/v1-merchant.md)

### Example Usage

```java
v1LocationsApi.listLocationsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

