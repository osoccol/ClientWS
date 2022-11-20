# ClientWS

Pour éxecuter le programme, il faut run la Java class /src/main/java/client/ClientWS.java.

Ce client java communique avec 2 Web Services, un SOAP et une API Rest.

Pour que le client communique avec ces web services, il faut que ces deux derniers soient ouverts sur leur port respectif.
- SOAP: cf.repo https://github.com/osoccol/BanqueWS
- API-REST: cf.repo https://github.com/osoccol/API-REST

Si le web service SOAP originel est modifié (nom des méthodes, arguments...), alors il faut réimporter le fichier WSDL et générer le code présent dans le package /src/main/java/proxy.
