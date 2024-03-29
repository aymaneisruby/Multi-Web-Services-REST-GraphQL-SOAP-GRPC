# Multi-Web-Services-REST-GraphQL-SOAP-GRPC

<p align="justify">L'architecture des microservices est un style d'architecture logicielle où une application est construite sous forme de plusieurs services indépendants qui collaborent pour fournir une fonctionnalité complète. Dans ce contexte, différents protocoles et formats de données sont utilisés pour la communication entre les microservices. Voici quelques-uns des protocoles et formats couramment utilisés dans l'architecture des microservices :</p>

* ## SOAP (Simple Object Access Protocol) : 
<p align="justify">Il utilise HTTP 1.1 comme protocole de transport et XML comme format de données. SOAP est un protocole basé sur des normes, offrant des fonctionnalités avancées telles que la sécurité et la fiabilité, mais il peut être complexe à mettre en œuvre et a tendance à être plus verbeux en raison de l'utilisation d'XML.</p>

* ## REST (Representational State Transfer) : 
<p align="justify">Il utilise également HTTP 1.1 comme protocole de transport, mais il est plus léger et plus simple que SOAP. REST peut utiliser différents formats de données tels que JSON, XML ou d'autres formats selon les besoins. Il est basé sur les verbes HTTP standard tels que GET, POST, PUT et DELETE pour effectuer des opérations sur les ressources.</p>

* ## GraphQL : 
<p align="justify">Il utilise HTTP 1.1 comme protocole de transport et JSON comme format de données. GraphQL offre une flexibilité accrue en permettant aux clients de spécifier les données exactes dont ils ont besoin, ce qui permet de minimiser les problèmes de surcharge de données. Il permet aux clients d'effectuer des requêtes complexes avec un seul appel.</p>

* ## gRPC (Google Remote Procedure Call) : 
<p align="justify">Il utilise HTTP/2 comme protocole de transport et ProtoBuf (Protobuf) comme format de données. gRPC est conçu pour une communication efficace entre les services et prend en charge la sérialisation binaire avec ProtoBuf, ce qui permet une taille de message réduite et des performances améliorées. Il prend en charge la génération automatique de code pour différentes langues de programmation.</p>
<p align="justify">
Chacun de ces protocoles et formats a ses propres avantages et est adapté à des cas d'utilisation spécifiques. Le choix dépend des besoins du système, des contraintes de performance, de la complexité des interactions et de la préférence de l'équipe de développement.</p>

* ## Objectifs : 

<center><img width="1643" alt="architecture" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/af2a2f10-8000-4e32-862a-2b98194eaacb">
</center>

<p align="justify">Dans ce système distribué, nous avons deux microservices : le Customer Service et le Account Service. L'objectif est de connecter ces deux services en utilisant les différentes générations des web services : REST, GraphQL, SOAP et gRPC.</p>

<p align="justify">Pour commencer, nous pouvons mettre en place une intégration basée sur REST. Le Customer Service peut exposer des endpoints RESTful pour les opérations relatives aux clients, tandis que l'Account Service peut exposer des endpoints RESTful pour les opérations liées aux comptes. Les deux services peuvent communiquer entre eux en utilisant des requêtes HTTP avec des formats de données tels que JSON ou XML, selon les besoins. Par exemple, le Customer Service peut envoyer une requête REST pour récupérer les informations du compte d'un client à l'Account Service.</p>

<p align="justify">Ensuite, nous pouvons envisager une intégration basée sur GraphQL. Dans cette approche, un point d'entrée GraphQL peut être mis en place, qui permet aux clients de formuler des requêtes flexibles pour obtenir les données nécessaires à partir des deux microservices. Les clients peuvent spécifier les champs et les relations exacts qu'ils souhaitent récupérer, ce qui permet d'éviter le surchargement de données. Les requêtes GraphQL peuvent être acheminées vers les microservices appropriés pour récupérer les informations nécessaires.</p>

<p align="justify">Ensuite, nous pouvons intégrer les microservices en utilisant le protocole SOAP. Le Customer Service peut exposer des opérations SOAP qui fournissent des fonctionnalités spécifiques liées aux clients, tandis que l'Account Service peut exposer des opérations SOAP pour les opérations liées aux comptes. Les services peuvent communiquer en utilisant des messages SOAP qui encapsulent les données pertinentes et les envoient via des appels de méthode à distance.</p>

<p align="justify">Enfin, nous pouvons intégrer les microservices en utilisant gRPC. Dans cette approche, nous pouvons définir des interfaces et des messages avec le langage de définition de protocole Protobuf (ProtoBuf). Le Customer Service et l'Account Service peuvent communiquer en utilisant le protocole gRPC, qui offre une communication efficace basée sur HTTP/2 et la sérialisation binaire optimisée. Les services peuvent échanger des messages structurés en utilisant les opérations définies dans les interfaces Protobuf.</p>

<p align="justify">En résumé, pour connecter les microservices Customer Service et Account Service, nous avons exploré les différentes générations des web services : REST, GraphQL, SOAP et gRPC. Chaque approche offre ses propres avantages en termes de flexibilité, de performance et de compatibilité. Le choix dépendra des besoins spécifiques du système, des contraintes techniques et des préférences de l'équipe de développement.</p>

# Partie Customer Service

<img width="590" alt="1" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/aa2e5ad1-686a-4032-8266-feb676cd8ccc">
<img width="590" alt="2" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f85a4299-b81c-4aa8-a53e-4d36af57833e">
<img width="590" alt="3" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/cc7b84e2-c284-491d-94b1-78ab68576984">
<img width="590" alt="4" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/1a49d93e-58cf-48d3-b841-a4ee624455c2">
<img width="960" alt="5" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/072db4c0-9a40-4ee6-948e-b95d03170915">
<img width="960" alt="6" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8bad8446-bb5c-403d-9b4f-25f4772bf5b0">
<img width="960" alt="6-1" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/4990ed59-eec3-41cb-8aac-33d98093f1bd">
<img width="960" alt="7" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/7cb104bd-a5ce-4489-b569-31fe261c0e8d">
<img width="960" alt="8" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6f5fc3d2-cbeb-4ac0-ad8e-026a0b7580be">
<img width="960" alt="9" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/1898ee65-dd41-4dd1-8b52-f7c296a83cc9">
<img width="960" alt="10" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b5908354-7ebd-48c0-a8f9-46b8e482bb9d">
<img width="960" alt="11" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/4c7227a1-1aa2-4765-b09b-c932f9aeb7fe">
<img width="960" alt="12" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8440b09b-c63d-4487-a93b-356f5a6c2ecc">
<img width="960" alt="13" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a8191cfc-768b-4d1e-b68c-72ad709428f2">
<img width="960" alt="14" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/553f19ad-c065-4cd2-a53e-f67bd1649780">
<img width="960" alt="15" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/341d63fc-a37e-43d2-be0f-5b29d0ae09b7">
<img width="960" alt="16" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a295cb52-25bf-490d-8faa-f579aa60eb37">
<img width="960" alt="17" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ffefb606-cd22-4d73-91ce-0655afc7f93e">
<img width="960" alt="18" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b9316765-773d-4e46-940d-36aff8a2e4d8">
<img width="960" alt="19" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/9cc1a81d-c690-42f6-a910-66d5fe3e3f32">
<img width="960" alt="20" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c7ba4814-2fa9-44d5-87e1-567db7a5871c">
<img width="960" alt="21" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/91528948-a736-4006-a1c9-0e3de4de6b1c">
<img width="960" alt="22" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/83d15b50-afe0-465a-8aa1-d635c5bf809d">
<img width="960" alt="23" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/0bb05850-160a-4669-af7d-8c7e372879cb">
<img width="960" alt="24" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/51cb083f-55e9-42a6-a14f-e6ce6483f497">
<img width="960" alt="25" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d1000e95-d5e2-41ef-a89e-ea4e9801e707">
<img width="960" alt="26" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/0531c0cf-e37b-40ec-9398-ad1bc6d5a394">
<img width="960" alt="27" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/036603ea-3d02-4572-a284-4277b66c474f">
<img width="960" alt="28" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/5999a582-a198-4b17-88bf-1f0435158e9b">
<img width="960" alt="29" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b8ad49e5-0f97-4539-89ef-d620e6829bb0">
<img width="960" alt="30" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/0749c1db-6369-42d1-82a5-3fd9c153222b">
<img width="960" alt="31" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/793d7fd5-0953-41b2-9cf0-90bee3714954">
<img width="960" alt="32" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/0d5c89cc-b544-4209-bf94-e9951077c0d0">
<img width="960" alt="33" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3a9f59ed-3342-433c-b586-ebf347be19cf">
<img width="960" alt="34" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/5ba90329-6815-40f3-a6d0-19d1c278a254">
<img width="960" alt="35" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/7a8f9c94-5cef-4ede-ab8f-f75b8de43717">
<img width="960" alt="36" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/1dc65ad0-52f9-4d27-b3d1-ea9a7eac6ae4">
<img width="960" alt="37" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/222bf02e-2592-459a-bf67-d540c6d237ab">
<img width="960" alt="38" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/65abba73-680c-4be9-9d0e-b41e460d17d6">
<img width="960" alt="39" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/dca675f0-0e74-4d14-8d33-5f86c4ea5db7">
<img width="960" alt="40" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f97bed1f-3cb9-4e26-9b9e-3827d88a6e6c">
<img width="960" alt="41" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/64577db4-3bb7-4305-a051-d09e8b8a7a81">
<img width="960" alt="42" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2ec05011-d356-4b37-9a82-49f3287a4364">
<img width="960" alt="43" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8cf16f14-8d43-4b64-a960-81166b1baa6a">
<img width="960" alt="44" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c66157f7-8ec5-40ed-8d65-364f62cab2bd">
<img width="960" alt="45" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/4d721dc3-ff47-4f2e-bd80-e475bfd2e2d3">
<img width="960" alt="46" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6cee4e94-1d98-4a24-9235-827c685efefd">
<img width="960" alt="47" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f48ee632-dd01-4160-8c26-1a09cde907cc">
<img width="960" alt="48" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/4fa707eb-13a9-43ba-bea4-55db42fbf323">
<img width="960" alt="49" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/4085811d-b0cd-4e9a-8a15-e56a9a5cddbc">
<img width="960" alt="50" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/22d66b2c-77e7-47ed-9b61-bedfae5ab040">
<img width="960" alt="51" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8e29a494-b8b1-4625-b5da-970cbef61dae">
<img width="580" alt="52" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/17cc8149-15ed-4dc0-9453-6c176edfca67">
<img width="960" alt="53" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ce3b6f9d-2309-4617-8c21-d428d91f50fd">
<img width="960" alt="54" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/54820091-a4be-452f-b1a1-76ad8dce1be5">
<img width="960" alt="55" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/93b9dda7-bda6-4790-b4a0-d93a6aba17b6">
<img width="960" alt="56" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8c9f9979-d84d-464b-ae96-23a4a495a801">
<img width="960" alt="57" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f7bb38a9-2c33-44a5-b13d-c33735f60a20">
<img width="960" alt="58" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/cd930003-cd82-4eca-b692-b5037ae1dd70">
<img width="960" alt="59" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f0874ded-d6a8-45d0-8dd5-3c5100f7d6d2">
<img width="960" alt="60" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e36b141b-739e-437a-bae0-9eef9d31acff">
<img width="960" alt="61" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e1c80d9b-29a6-45b3-930d-9c64028dfba5">
<img width="960" alt="62" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/89aff54f-6af4-45f3-88f9-5369616f4356">
<img width="960" alt="63" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d838a01b-362c-4c28-b39c-950b9f595a40">
<img width="960" alt="64" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/52368bba-55cc-4e86-b7d4-48fb248b8c77">
<img width="960" alt="65" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/cb8bacca-fecf-4298-b8b4-ffb096be1bbc">
<img width="960" alt="66" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6a2da99b-f5f2-4b29-9131-9e8e2d2454b7">
<img width="960" alt="67" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/573833ba-e933-40ca-b2a5-e8d05a187cfd">
<img width="960" alt="68" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d5f9e649-f15c-4d8b-9fa7-bb8f27e19e3c">
<img width="960" alt="69" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/90e79182-6ddd-4e9d-b8f6-fccca1f14e21">
<img width="960" alt="70" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ef85dbb5-ee8e-4228-9fc8-cea23f0b688f">
<img width="960" alt="71" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/86bd520c-e221-4fac-9a4a-6e7c525ccbdd">
<img width="960" alt="72" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d3820e22-c187-4c24-be8c-86c50932ce33">
<img width="960" alt="73" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d82beaa9-2b64-4456-8e49-d82d1190aaee">
<img width="960" alt="74" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c8262694-40ce-4ec8-997c-a8d65bde97f6">
<img width="960" alt="75" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/cd794e2a-adeb-4243-a404-4ef9c7b86126">
<img width="950" alt="76" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e5b262f9-4198-4d60-8d93-007cf75169d0">
<img width="950" alt="77" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/5ace4546-ff55-4239-a11e-1b5eb071b177">
<img width="950" alt="78" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6c3ac8a4-aed5-4216-8cea-34d13e6e5def">
<img width="960" alt="79" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c5b8d520-1190-44b5-89cd-63f8e8a2af82">
<img width="960" alt="86" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b80e4424-6abb-49bc-9bba-361930a267d0">
<img width="960" alt="87" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/aa3a5b8e-0a3c-494a-bbfa-a8b807face7c">
<img width="960" alt="88" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/26277640-0016-4f8d-97eb-91d6b4a70ebe">
<img width="960" alt="89" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/03d3cf14-d986-406b-9e81-6bbf06af09d5">
<img width="960" alt="80" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/5a96d879-79bd-4da7-9278-33f06b493d2c">
<img width="960" alt="81" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/332d069f-fc86-410b-8388-db2217a23310">
<img width="960" alt="82" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d3ca308d-5ce2-4101-87e2-c338f0c9fc11">
<img width="960" alt="83" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/99468a86-d189-49f5-a9f3-20a01db347f1">
<img width="960" alt="84" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/905831e3-3db2-4447-8850-ee8bf6fcc956">
<img width="960" alt="85" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c1f5bb01-f456-4775-88fa-e9b1493cdb89">


# Partie Account Service



<img width="602" alt="0" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/84ad6beb-6047-4eaa-9220-17e001acbefa">
<img width="602" alt="0-1" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/0315f7f5-b73c-4e7e-959a-354f8d6d2923">
<img width="960" alt="3" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/94c2dc44-1ee0-47e3-a6ca-295e27fd7971">
<img width="960" alt="4" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/30e74ffb-8dfd-4556-9be7-12240e61d0b3">
<img width="960" alt="5" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/616137e0-73dc-487b-a82b-a3ab8705a128">
<img width="960" alt="6" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b63261bf-772c-4542-85e1-fdd8b1dbf4f0">

<p>Exécutez la commande suivante pour générer les classes Java SOAP</p>

```shell
mvn generate-sources
```
<p>Une fois le processus terminé, vous trouverez les classes Java générées dans le répertoire source spécifié</p>

```shell
target/generated-sources/cxf
```
<img width="960" alt="48" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/9824fef2-6647-4fd0-a283-0606ad02e67e">
<img width="960" alt="49" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/39e906ba-d8d8-46a4-a4cf-928121d79a9d">
<img width="960" alt="50" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/345ce8b3-7673-44c3-b106-97da37d28f69">
<img width="963" alt="18" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2e757c4a-4eb9-46d7-8b28-ff252274cec3">
<img width="960" alt="19" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ea00ebaf-e557-46e1-b93d-732e75643d8f">
<img width="960" alt="20" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6b12a368-3227-485b-9e5d-c9ccbe675639">
<img width="960" alt="21" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a72b0d62-d2eb-44b7-9d88-2a3b48641caf">
<img width="960" alt="22" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/7ae7ba18-4a2f-42fa-8fac-f0e230920e9e">
<img width="960" alt="23" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/eaf7ae86-b0bb-47ec-bc25-de03b03a9938">
<img width="960" alt="24" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f786fe95-9c25-4d34-8d1c-01b3e005c6e6">
<img width="960" alt="25" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/1ad23823-e0e1-410e-a695-0e7ac0652d91">
<img width="960" alt="51" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/80e4051f-2d65-4dd9-9413-4728afd7e7db">
<img width="960" alt="29" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a41b8531-4fb6-42db-917d-73721b35688e">
<img width="960" alt="34" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d2261f6a-31f5-486a-a9b0-f2f52f3b1012">


# Client Endpoints 

The SOAP endpoint URL is [http://localhost:8080/customersSoap](http://localhost:8080/customersSoap).<br>
The gRPC endpoint URL is [http://localhost:8080/customersGrpc](http://localhost:8080/customersGrpc).<br>
The GraphQL endpoint URL is [http://localhost:8080/customersGql](http://localhost:8080/customersGql).<br>
The GraphQL (extended) endpoint URL is [http://localhost:8080/customersGraphql](http://localhost:8080/customersGraphql).<br>
The REST endpoint using RestTemplate URL is [http://localhost:8080/customersRestTemplate](http://localhost:8080/customersRestTemplate).<br>
The REST endpoint using WebClient URL is [http://localhost:8080/customersWebClient](http://localhost:8080/customersWebClient).<br>
The REST endpoint using RestFeign URL is [http://localhost:8080/customersRestFeign](http://localhost:8080/customersRestFeign).<br>
<br>
Accédez au client spécifique à l'aide de WebClient :
- Customer 1: [http://localhost:8080/customersWebClient/1](http://localhost:8080/customersWebClient/1)<br>
- Customer 2: [http://localhost:8080/customersWebClient/2](http://localhost:8080/customersWebClient/2)<br>
- Customer 3: [http://localhost:8080/customersWebClient/3](http://localhost:8080/customersWebClient/3)<br>

Accédez au client par ID à l'aide de RestFeign :
- Customer 1: [http://localhost:8080/customerByIdRestFeign/1](http://localhost:8080/customerByIdRestFeign/1)<br>
- Customer 2: [http://localhost:8080/customerByIdRestFeign/2](http://localhost:8080/customerByIdRestFeign/2)<br>
- Customer 3: [http://localhost:8080/customerByIdRestFeign/3](http://localhost:8080/customerByIdRestFeign/3)<br>

Accédez au client par ID à l'aide de GraphQL :
- Customer 1: [http://localhost:8080/customerByIdGql/1](http://localhost:8080/customerByIdGql/1)<br>
- Customer 2: [http://localhost:8080/customerByIdGql/2](http://localhost:8080/customerByIdGql/2)<br>
- Customer 3: [http://localhost:8080/customerByIdGql/3](http://localhost:8080/customerByIdGql/3)<br>

<img width="960" alt="35" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/58b5483c-651c-41b9-90f2-876e79b1982f">
<img width="960" alt="36" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/74fb32f3-41c7-4340-aef2-01d3bf067e9b">
<img width="960" alt="37" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e0a3e065-1fd9-46d2-87d2-9038b952ddb7">
<img width="960" alt="38" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/05a884ee-3c58-49a3-85a3-e9bfcfa07f71">
<img width="960" alt="39" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2cdf21b8-eeca-40ca-af68-d828b7f4a4e5">
<img width="960" alt="40" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/76ab5a76-1ca8-4779-a584-c372ab6ffbd8">
<img width="960" alt="41" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/7899ee8c-e5b4-4278-8eef-63dd0fb45b72">
<img width="960" alt="42" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e52c3505-90c0-4775-b4ee-b77b5e361c4b">
<img width="960" alt="43" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/86b8325d-1776-4e68-8a7c-ca455c503729">
<img width="960" alt="44" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/619a398c-6e84-460a-9923-82c7a20212df">
<img width="960" alt="45" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6a7f7bbb-ad7d-46a0-9b7e-ec9b2b72ee5c">











