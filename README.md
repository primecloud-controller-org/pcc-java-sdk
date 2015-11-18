# pcc-java-sdk

## Description

Java SDK for PrimeCloud Controller.


## Usage

Create **jp.primecloud.auto.sdk.Pcc** instance, and call method.


## Example

### ListFarm API

```java
Pcc pcc = new Pcc("PCC_URL", "PCC_ACCESS_ID", "PCC_ACCESS_KEY");

List<Farm> farms = pcc.listFarm();

for (Farm farm : farms) {
    System.out.println(farm.getFarmNo() + "\t" + farm.getFarmName());
}
```

## Usage for maven

Add the following repository setting into pom.xml,

```
<repositories>
  <repository>
    <id>pcc-mvn-repo</id>
    <url>https://ymstmsys.github.io/mvn-repo/</url>
  </repository>
</repositories>
```

and add dependency setting.
