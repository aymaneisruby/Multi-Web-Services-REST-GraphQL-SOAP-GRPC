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

<center><img width="1643" alt="architecture" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3befacca-bfaa-4ce9-bcdf-24a7d5e39522"></center>

<p align="justify">Dans ce système distribué, nous avons deux microservices : le Customer Service et le Account Service. L'objectif est de connecter ces deux services en utilisant les différentes générations des web services : REST, GraphQL, SOAP et gRPC.</p>

<p align="justify">Pour commencer, nous pouvons mettre en place une intégration basée sur REST. Le Customer Service peut exposer des endpoints RESTful pour les opérations relatives aux clients, tandis que l'Account Service peut exposer des endpoints RESTful pour les opérations liées aux comptes. Les deux services peuvent communiquer entre eux en utilisant des requêtes HTTP avec des formats de données tels que JSON ou XML, selon les besoins. Par exemple, le Customer Service peut envoyer une requête REST pour récupérer les informations du compte d'un client à l'Account Service.</p>

<p align="justify">Ensuite, nous pouvons envisager une intégration basée sur GraphQL. Dans cette approche, un point d'entrée GraphQL peut être mis en place, qui permet aux clients de formuler des requêtes flexibles pour obtenir les données nécessaires à partir des deux microservices. Les clients peuvent spécifier les champs et les relations exacts qu'ils souhaitent récupérer, ce qui permet d'éviter le surchargement de données. Les requêtes GraphQL peuvent être acheminées vers les microservices appropriés pour récupérer les informations nécessaires.</p>

<p align="justify">Ensuite, nous pouvons intégrer les microservices en utilisant le protocole SOAP. Le Customer Service peut exposer des opérations SOAP qui fournissent des fonctionnalités spécifiques liées aux clients, tandis que l'Account Service peut exposer des opérations SOAP pour les opérations liées aux comptes. Les services peuvent communiquer en utilisant des messages SOAP qui encapsulent les données pertinentes et les envoient via des appels de méthode à distance.</p>

<p align="justify">Enfin, nous pouvons intégrer les microservices en utilisant gRPC. Dans cette approche, nous pouvons définir des interfaces et des messages avec le langage de définition de protocole Protobuf (ProtoBuf). Le Customer Service et l'Account Service peuvent communiquer en utilisant le protocole gRPC, qui offre une communication efficace basée sur HTTP/2 et la sérialisation binaire optimisée. Les services peuvent échanger des messages structurés en utilisant les opérations définies dans les interfaces Protobuf.</p>

<p align="justify">En résumé, pour connecter les microservices Customer Service et Account Service, nous avons exploré les différentes générations des web services : REST, GraphQL, SOAP et gRPC. Chaque approche offre ses propres avantages en termes de flexibilité, de performance et de compatibilité. Le choix dépendra des besoins spécifiques du système, des contraintes techniques et des préférences de l'équipe de développement.</p>

# Partie Customer Service

<img width="590" alt="1" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/11a557b8-3b94-4667-aaf6-4e365a4bca79">
<img width="590" alt="2" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/0c7c0de4-03af-480f-a6eb-862403676252">
<img width="590" alt="3" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b149bfa9-c234-4bf8-8342-0e727d17a0c4">
<img width="590" alt="4" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c052d3ee-fda5-41a4-8aef-f623fb090ee8">
<img width="960" alt="5" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3fb953ba-259d-4b0e-9dd4-8b0e19688a0d">
<img width="960" alt="6" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/361aa0b8-5276-4452-9c9c-b4199022ef3c">
<img width="960" alt="6-1" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/beb85c51-4793-4628-a59a-2bf6181b0e07">
<img width="960" alt="7" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/158a8b15-b96e-469f-892c-5b8c598c9860">
<img width="960" alt="8" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/36031c74-5488-4716-a95b-43f4d6d01eea">
<img width="960" alt="9" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3263a58a-6945-4d4f-a666-84be0a2b4dba">
<img width="960" alt="10" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/67cea9b7-a8c6-4eec-80cc-a2e313c32e1d">
<img width="960" alt="11" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e2505271-6a1c-4825-81c7-f20fc0bb00c8">
<img width="960" alt="12" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/98156e6b-24bf-4c8d-a99b-93af84668078">
<img width="960" alt="13" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ea20b2e0-8b22-423f-9835-09927f319d22">
<img width="960" alt="14" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b608534e-191e-4b49-a857-f0b92aa6d924">
<img width="960" alt="15" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/26e2fb4a-da06-48d6-989b-8dd0e0e7c3e8">
<img width="960" alt="16" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d8013b37-dd59-476b-a78d-040a5fe275cb">
<img width="960" alt="17" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e32304bb-1073-4b24-b21e-d9e1dd65b31e">
<img width="960" alt="18" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/1d44d582-5d6b-427e-ad65-232ab5618549">
<img width="960" alt="19" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/dbf0715f-3f02-40f1-8207-a7e0da6b2b3f">
<img width="960" alt="20" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/257bb547-093b-4bc6-baf6-421f766a26f0">
<img width="960" alt="21" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/99f37312-a9e6-4a31-bd5c-c4451f5f7644">
<img width="960" alt="22" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8c8e61b6-f815-441d-aed5-8e41d9054cb8">
<img width="960" alt="23" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f69d6b4a-589a-4ae1-980f-57a6f2af7dcd">
<img width="960" alt="24" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d5676841-4b74-4fe8-b7d9-808e98b7c33e">
<img width="960" alt="25" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/581ebc5d-033f-4614-a6d5-ed3a360f58f3">
<img width="960" alt="26" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/12efbd2a-aa51-41b3-b990-f954bfa7fbcd">
<img width="960" alt="27" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/cd33ead9-009b-4346-974b-3e672b48c58d">
<img width="960" alt="28" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3630e7c0-9126-4588-8b8d-0014ba3ef44c">
<img width="960" alt="29" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/34d3f12a-8eb9-4918-bada-ff12185e7f9b">
<img width="960" alt="30" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2f40d2c9-94a4-4190-a7ad-e87d186b7b4c">
<img width="960" alt="31" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a3f7cddf-774b-4fb0-b970-5aa89d2be639">
<img width="960" alt="32" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/da406bd7-3387-4325-85dd-f8040d4c602a">
<img width="960" alt="33" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/9066b0c7-eea3-4f88-864b-a4fa21d60061">
<img width="960" alt="34" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/bc99e5b6-5748-4fc2-a3bf-31670dbd64cf">
<img width="960" alt="35" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8003772c-2b4d-432f-892b-9667761bd47a">
<img width="960" alt="36" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a73fda62-0f4d-4e7d-924f-decc431d1fdf">
<img width="960" alt="37" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/39acfa90-3b6b-4788-989b-b8980f5e0143">
<img width="960" alt="38" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ff0eca21-a146-4676-b2a8-c107e5e40798">
<img width="960" alt="39" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/31128926-0344-46e7-8bf8-d21179ea9436">
<img width="960" alt="40" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c261fad4-7f00-456d-b457-0215d4fa5def">
<img width="960" alt="41" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3fadbbaf-8de6-43be-a9c3-970b3adf6fe7">
<img width="960" alt="42" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/65d18ecf-e3dc-49cb-a1a5-8bf4bea251c3">
<img width="960" alt="43" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e8eaf61d-799a-4507-b944-468f34428c0d">
<img width="960" alt="44" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/7e5a8c3f-a36a-4f81-a507-bfdc2acbc787">
<img width="960" alt="45" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c5c70bb2-efd8-4804-b966-6ebfccf70f21">
<img width="960" alt="46" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c4e068bc-bade-48e7-852e-f3591c29a6dc">
<img width="960" alt="47" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/df90ef8e-bec2-4b3f-8335-d63b4b6a1d08">
<img width="960" alt="48" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/dda549b4-cddc-4bbf-883d-38f50da34858">
<img width="960" alt="49" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/7ada8267-a8d6-41cf-a7de-cd70417d0198">
<img width="960" alt="50" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/7f0a9f7f-1cb3-4ed3-9473-8237015077d9">
<img width="960" alt="51" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ccf941ca-7e00-4782-9caf-f984b06159fa">
<img width="580" alt="52" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b7cab4d6-020b-47ba-86ed-48941e33ff4a">
<img width="960" alt="53" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2cb85708-b2c0-477f-afe9-675f21b8b891">
<img width="960" alt="54" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3917a1a5-b94b-4c51-9c07-259bb9c40d78">
<img width="960" alt="55" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/fac8c61f-8b2e-4cc2-b688-219e0a37d854">
<img width="960" alt="56" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f1b2b2a4-52de-4aed-b68d-76b2a759c352">
<img width="960" alt="57" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c2ae6f87-e998-4ccf-9f89-204b02d5fb28">
<img width="960" alt="58" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2b326102-aeec-43f8-9de0-b43db5f07ed7">
<img width="960" alt="59" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e7270c6a-f39e-4469-aeda-566dd0f2b9d9">
<img width="960" alt="60" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/af00b787-9ba4-44e5-a706-118193cfd2a5">
<img width="960" alt="61" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8c7f1703-46cc-480f-83d5-597f5c0c4962">
<img width="960" alt="62" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c405c271-7f3a-4b0a-bd53-dd9539565485">
<img width="960" alt="63" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/711d2e1c-519b-4a0c-a5f3-42a986880fb4">
<img width="960" alt="64" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/22adae62-90ac-4ec7-b11f-0f45b274c22e">
<img width="960" alt="65" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8624babb-9ef3-41e2-86f4-f92bc08b1c3f">
<img width="960" alt="66" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/fa9cbe74-cd14-47a7-af37-e849f4b3ddd0">
<img width="960" alt="67" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2fa5be65-895a-4e8c-b1d2-8ccb35d9e958">
<img width="960" alt="68" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/de79d354-a204-458e-b013-17ce44f80cb7">
<img width="960" alt="69" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ca747d20-d689-48fd-b6a4-2042bca6933d">
<img width="960" alt="70" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3a7d7216-61f6-4893-8aac-b8afbe512ceb">
<img width="960" alt="71" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/aee5dc66-10d4-45c2-a83f-4e79059d6307">
<img width="960" alt="72" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2740ad65-f58d-4095-b7ea-98c681d8efcd">
<img width="960" alt="73" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/9fd7ef27-49be-4ac3-891b-0ac451b6dae2">
<img width="960" alt="74" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3eccdac6-8f8f-402f-b042-59d9fef6db78">
<img width="960" alt="75" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/693f567b-1a39-4f48-8d00-6d6364bf9de7">
<img width="950" alt="76" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/fc0302f5-29dc-45a0-a565-03833cbd23cf">
<img width="950" alt="77" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e78b1be3-155d-488a-a70e-8e9f271e3a76">
<img width="950" alt="78" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b670b931-746f-454e-9e7a-7130360d887d">
<img width="960" alt="79" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/14f020c4-d67f-476a-9c98-4fa55d939564">
<img width="960" alt="86" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d9cf47cd-9bd5-475b-9b80-b1aae86a4949">
<img width="960" alt="87" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b2ba9cd0-df56-4fb1-b7cd-722352e0457a">
<img width="960" alt="88" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/c4514a5f-795f-4662-98bc-91e93cf40394">
<img width="960" alt="89" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/907f1f72-525f-46b1-afbf-270fcc81e178">
<img width="960" alt="80" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/fc2979b6-1576-4366-a497-b9794e7dd57b">
<img width="960" alt="81" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/2100476e-5ff3-476f-b900-4d3749000676">
<img width="960" alt="82" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6fcaaaa3-54ba-4c49-b10e-9b74b4951cf8">
<img width="960" alt="83" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e8d283d9-0d82-4531-87b0-155f478c6b34">
<img width="960" alt="84" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/79972ef0-3639-4d7a-93ae-56e4ce32b7f6">
<img width="960" alt="85" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/61851960-3aa9-4f76-ac09-a55a491a91ea">

# Partie Account Service

<img width="602" alt="0" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/e7705010-9c14-4d58-87d0-9f06fb370e09">
<img width="602" alt="0-1" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/4ac7e607-219f-4686-a119-fc11b917af30">
<img width="960" alt="3" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/7d1cfd0d-b3d8-4e98-b519-2fc61111da1a">
<img width="960" alt="4" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/895d8e99-796c-49a6-85c5-b3caa6e65257">
<img width="960" alt="5" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f5a10ec3-3db0-44d6-b4cd-df8512329d8b">
<img width="960" alt="6" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a11191d3-a35b-4cd9-94ae-ddfaf83a1fe7">
<img width="960" alt="7" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/0f6f014f-35fa-4994-b967-5422bf21161a">
<img width="960" alt="8" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a7fae038-5f00-4882-baa6-b78af91ec104">
<img width="960" alt="9" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/323b38d2-1269-4943-b2b2-6b5f62c37e79">
<img width="960" alt="10" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ca79a97d-ecda-4ef8-a1c1-997739e4f3f9">
<img width="960" alt="11" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/149dc9d7-1d44-4050-b9e0-abc6a8c10481">
<img width="960" alt="12" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ee7353b3-0431-422a-9b51-245adb4f1a65">
<img width="960" alt="48" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6914b8b9-c827-436e-b515-1d8bdff75bfc">
<img width="960" alt="49" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/50834a3a-507f-4855-95aa-a9a194a331bd">
<img width="960" alt="50" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3422d0cc-f12e-4e1a-9d32-8306cce599e4">
<img width="960" alt="27" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/100b2233-dc19-491f-95b1-27dc849d13ee">
<img width="960" alt="28" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/58696708-99ff-4963-99a5-a4973c8a17a6">
<img width="960" alt="26" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b49ec118-0244-4f65-9533-19411af69a9a">
<img width="960" alt="31" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8fe12b70-e484-4eee-8593-dc499b680cf6">
<img width="960" alt="32" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/138c6555-af29-4902-a07d-10d7d9dfae79">
<img width="960" alt="33" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/8f2227e4-cec6-4ce5-9441-5c2f00b73774">
<img width="960" alt="30" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/b79ae476-33b6-4bd1-83d3-9e8ab97439e2">
<img width="960" alt="13" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/1ff9210b-eb2c-4aa0-8f6f-0422f7229947">
<img width="960" alt="14" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/cd873e67-978f-44b9-bd7e-0a7c30808015">
<img width="960" alt="15" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/08d44b4f-fff9-425c-8fb9-9a06da074806">
<img width="960" alt="30" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/0cbd9b3a-08e1-40cf-b296-4c566cb6f628">
<p>Exécutez la commande suivante pour générer les classes Java SOAP</p>

```shell
mvn generate-sources
```
<p>Une fois le processus terminé, vous trouverez les classes Java générées dans le répertoire source spécifié</p>

```shell
target/generated-sources/cxf
```
<img width="963" alt="18" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/70372fba-58e0-4eac-a0c0-3dcd097a24dc">
<img width="960" alt="19" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/ebd5b712-2b72-4a26-8aea-c2835e6bd8c1">
<img width="960" alt="20" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/402b0608-1e7f-4562-b580-1237da845b1a">
<img width="960" alt="21" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/21e43b67-85bc-4f3b-b0f2-34876fd4c407">
<img width="960" alt="22" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/051607d2-dc5e-4dc6-a8bc-7ae5e627ee93">
<img width="960" alt="23" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/1bb367e8-b5d3-4d7b-a712-6840311cbbab">
<img width="960" alt="24" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/9964d7d8-cec6-478f-bd49-7c49664aa01e">
<img width="960" alt="25" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/84b5b6c3-1901-4331-8632-e70c86c349dd">
<img width="960" alt="51" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/9faa36f2-b821-4390-8eb1-3bd4f2fb91a9">
<img width="960" alt="29" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6ad5d597-b39b-4296-8fa0-4820fe80f3db">
<img width="960" alt="34" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/138f002a-30c1-4c76-ad40-2c7fde0c165a">

<p>Lancez le service customer :</p>

<img width="960" alt="47" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/513001e6-a467-4258-bb2e-6eecc49b5f91">
<img width="960" alt="46" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/128e027d-5a66-4922-8f9d-b594f9a80fac">

The SOAP endpoint URL is [http://localhost:8080/customersSoap](http://localhost:8080/customersSoap).<br>
The gRPC endpoint URL is [http://localhost:8080/customersGrpc](http://localhost:8080/customersGrpc).<br>
The GraphQL endpoint URL is [http://localhost:8080/customersGql](http://localhost:8080/customersGql).<br>
The GraphQL (extended) endpoint URL is [http://localhost:8080/customersGraphql](http://localhost:8080/customersGraphql).<br>
The REST endpoint using RestTemplate URL is [http://localhost:8080/customersRestTemplate](http://localhost:8080/customersRestTemplate).<br>
The REST endpoint using WebClient URL is [http://localhost:8080/customersWebClient](http://localhost:8080/customersWebClient).<br>
The REST endpoint using RestFeign URL is [http://localhost:8080/customersRestFeign](http://localhost:8080/customersRestFeign).<br>
<br>
Access the specific customer using WebClient:
- Customer 1: [http://localhost:8080/customersWebClient/1](http://localhost:8080/customersWebClient/1)<br>
- Customer 2: [http://localhost:8080/customersWebClient/2](http://localhost:8080/customersWebClient/2)<br>
- Customer 3: [http://localhost:8080/customersWebClient/3](http://localhost:8080/customersWebClient/3)<br>

Access the customer by ID using RestFeign:
- Customer 1: [http://localhost:8080/customerByIdRestFeign/1](http://localhost:8080/customerByIdRestFeign/1)<br>
- Customer 2: [http://localhost:8080/customerByIdRestFeign/2](http://localhost:8080/customerByIdRestFeign/2)<br>
- Customer 3: [http://localhost:8080/customerByIdRestFeign/3](http://localhost:8080/customerByIdRestFeign/3)<br>

Access the customer by ID using GraphQL:
- Customer 1: [http://localhost:8080/customerByIdGql/1](http://localhost:8080/customerByIdGql/1)<br>
- Customer 2: [http://localhost:8080/customerByIdGql/2](http://localhost:8080/customerByIdGql/2)<br>
- Customer 3: [http://localhost:8080/customerByIdGql/3](http://localhost:8080/customerByIdGql/3)<br>

<img width="960" alt="35" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/d78b73f8-04c1-4f90-b278-87e991e0a09e">
<img width="960" alt="36" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/a0ecf0d4-26a6-4b1e-ad5b-52202fa77054">
<img width="960" alt="37" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/f6fcd3dc-ae89-4c15-9ba0-f8e19cff173c">
<img width="960" alt="38" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6ecce8bf-f02d-4930-8fd7-00dd577052d0">
<img width="960" alt="39" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/6763855c-42c4-46f0-bfba-1caf8b3be748">
<img width="960" alt="40" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/205ff332-6bb0-4dbc-98a2-4156950f933b">
<img width="960" alt="41" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/bb1ebfa1-c615-4f66-b725-8b716a41cc54">
<img width="960" alt="42" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/39964069-db06-4e52-9fe4-b686e5b10d8f">
<img width="960" alt="43" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/928ec254-57cc-41db-9b9a-ae246dbbc0dc">
<img width="960" alt="44" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/3d59a92b-8431-4802-8d49-06f2f59120cc">
<img width="960" alt="45" src="https://github.com/aymaneisruby/Multi-Web-Services-REST-GraphQL-SOAP-GRPC/assets/105078337/12b0d080-6683-4490-b6e7-370fa584a288">








