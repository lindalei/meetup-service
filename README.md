# document-service-lib-sample
give an example of how to call document lib service

## Feature Support
* tenant on board & off board
* upload document (include malware scan)
* download document
* rename document
* copy document
* get document list
* delete document

![](./image/sample-APIs.png)


## Locally run:
- Create DB instance with your DB tool.
- Set environment VCAP_SERVICES.
- Run DocumentServiceerviceLibSampleApplication.
- Access via url:
- onBoard
- http://localhost:8080/DocumentService/tenant({tenantId})
- OffBoard
- http://localhost:8080/DocumentService/tenant({tenantId})
- Upload
- http://localhost:8080/DocumentService/tenant({tenantId})/attachment
- Download
- http://localhost:8080/DocumentService/tenant({tenantId})/{userKey}
- Rename
- http://localhost:8080/DocumentService/attachment/{userKey}/{newName}
- Copy
- http://localhost:8080/DocumentService/attachment/{sourceAttachmentKey}/{targetAttachmentKey}/{targetExternalKey}
- Get document list by external key
- http://localhost:8080/DocumentService/attachment/{externalKey}

## Cloud run:
https://dpp-development-md-perf-document-service-lib-sample.cfapps.sap.hana.ondemand.com/swagger-ui.html#/

