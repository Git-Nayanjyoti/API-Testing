
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white) 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Apache](https://img.shields.io/badge/apache-%23D42029.svg?style=for-the-badge&logo=apache&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

# Web API Testing

API testing is a software testing practice that tests the APIs directly from their functionality, reliability, performance, to security. Part of integration testing, API testing effectively validates the logic of the build architecture within a short amount of time.

This repository will give you an idea of how we can create our own framework for testing Web APIs using `Apache` `HTTP` library.

## Types of Web APIs:
* Open APIs
* Partner APIs
* Internal APIs
* Composite APIs

## API architecture
An API’s architecture consists of the rules that guide what information an API can share with clients and how it shares the data.
* REST API
* SOAP(Simple Object Access Protocol) API
* RPC(Remote Procedural Call) API

## HTTP Methods
- GET
- POST
- DELETE
- OPTION (204)
- PUT
- PATCH
- TRACE
- HEAD

## HTTP Headers
```yaml
Request URL: https://api.github.com/
Request Method: GET
Status Code: 304 
Remote Address: 13.234.168.60:443
Referrer Policy: strict-origin-when-cross-origin

```
## Basic Framework Structure
```yaml
HttpGet get = new HttpGet(url);
Response = client.execute(get);
Int code = response.getStatusLine().getStatusCode();

```
```yaml
@Test
public void baseUrlReturns200() throws ClientProtocolException, IOException {
HttpGet get = new HttpGet(BASE_ENDPOINT);
response = client.execute(get);
int actualStatus = response.getStatusLine().getStatusCode();
Assert.assertEquals(actualStatus, 200);
}
```



## Roadmap

- Testing tools for Web APIs (I have used *github API)
- Importing the Dependencies required 
- Writing automation test scripts in java 
    - Test definition(Using BDD)
    ```yaml
    - Given: API url is http://api.github.com
      When: User sends a GET request
      Then: Response status code is 200

    - Given: API url is http://api.github.com/nonexistingendpoint
      When: User sends a GET request
      Then: The response status code is 404

    ```

## Dependencies
- [Jackson-databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
- [Apache http Client](https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient)
- [Jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo)
- [Json](https://mvnrepository.com/artifact/org.json/json)
## Authors

- [@Nayanjyoti Rabha](https://www.github.com/Git-Nayanjyoti)

