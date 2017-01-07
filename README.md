# pcc-java-sdk

## Description

Java SDK for PrimeCloud Controller.



## Requirement

**pcc-java-sdk** works on Java 8.



## Support PCC version

| PrimeCloud Controller | pcc-java-sdk |
|-----------------------|--------------|
| 2.8.0 | 1.2.0 |
| 2.7.0 | 1.1.0 |
| 2.6.0 | 1.0.0 |



## Usage

Add the following repository setting into pom.xml,

```
<repositories>
  <repository>
    <id>pcc-mvn-repo</id>
    <url>https://primecloud-controller-org.github.io/mvn-repo/</url>
  </repository>
</repositories>
```

and add dependency setting,

```
<dependency>
  <groupId>jp.primecloud.auto.sdk</groupId>
  <artifactId>pcc-java-sdk</artifactId>
  <version>VERSION</version>
</dependency>
```

Then, create **jp.primecloud.auto.sdk.Pcc** instance, and call method.



## Example

### ListFarm API

```java
Pcc pcc = new Pcc("PCC_URL", "PCC_ACCESS_ID", "PCC_ACCESS_KEY");

List<Farm> farms = pcc.listFarm();

for (Farm farm : farms) {
    System.out.println(farm.getFarmNo() + "\t" + farm.getFarmName());
}
```



## License

**pcc-java-sdk** is released under version 2.0 of Apache License.

http://www.apache.org/licenses/LICENSE-2.0

