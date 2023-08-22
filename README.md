# estudo_docker  
  
docker run hello-world  
docker pull hello-world  
  
docker ps (-a)(-s)  
docker container ls (-a)  
  
docker run ubuntu sleep 1d  
docker run -it ubuntu bash   
docker run -d dockersample/static-site  
docker run -d -P dockersamples/static-site  
docker run -d -p 8080:80 dockersamples/static-site  
docker run -it -v volume-docker:/app ubuntu bash  
docker run -it --mount type=bind,source=C:\Users\pedro\Documents\Projetos\Docker\volume-docker,target=/app ubuntu bash  
docker run -it --mount source=volume-docker,target=/app ubuntu bash  
docker run -it --name ubuntu1 --network minha-bridge ubuntu bash  
docker run -d --network mysql-rede --network-alias mysql --mount source=mysql-volume,target=/var/lib/mysql -e MYSQL_ALLOW_EMPTY_PASSWORD=yes mysql:5.7  
  
docker stop -t=0 (containerId)  
docker stop (containerId)  
docker stop $(docker container ls -q)  
docekr start (containerId)  
docker pause (containerId)  
docker unpause (containerId)  
  
docker exec -it (containerId) bash  
docker exec -it 5ae mysql  
  
docker rm (containerId)  
docker rm (containerId) --force  
docker container rm $(docker container ls -aq)  
docker rmi $(docker images -aq)  
  
docker port (containerId)  
  
docker images  
docker images ls  
  
docker inspect (imageId)  
docker history (imageId)  
  
docker volume  
docker volume ls  
docker volume create meu-volume  
  
docker network   
docker network create --driver bridge minha-bridge  
docker network ls  
  
  
  
docker build -t  pedroh/app-node:1.0 .  
https://docs.docker.com/engine/reference/builder/  -> dockerfile documentação  
  
  
dockerfile  
FROM node:14  
WORKDIR /app-node  
ARG PORT_BUILD=6000  
ENV PORT=$PORT_BUILD  
EXPOSE $PORT_BUILD  
COPY . .  
RUN npm install  
ENTRYPOINT npm start  
  
docker-compose  
docker-compose up -d  
docker-compose ps  
docker-compose down  
docker-compose up (dentro da pasta que tiver o arquivo compose.yml para subir o arquivo)  
  
version: "3.9"  
services:  
  mongodb:  
    image: mongo:4.4.6  
    container_name: meu-mongo  
    networks:  
      - compose-bridge  
  
    alurabooks:  
      image: aluradocker/alura-bookes:1.0  
      container_name: alurabooks  
      networks:  
       - compose-bridge  
      ports:  
       - 3000:3000  
      depends_on:  
       - mongodb  
networks:  
  compose-bridge:  
    driver:bridge  
_______________________________________________________________________________________________________________________  
mysql no docker  
1 - docker image pull mysql:5.7  
2 - docker run -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -v C:\Users\pedro\Projetos\MySQL_Volume:/var/lib/mysql mysql:5.7  
2.1 - docker run -it --name banco-mysql -e MYSQL_ROOT_PASSWORD=123 -v C:\Users\pedro\OneDrive\Documentos\docker-volume:/var/lib/mysql -p 3306:3306 -d mysql:8.0  
3 - docker container inspect 0f2  
4 - docker exec -it 0f2 bash  
_______________________________________________________________________________________________________________________  
  
pwd                                                             --> exibe o diretório aonde se encontra.  
docker run ubuntu:16.04                                         --> baixa uma imagem do ubuntu no DockerHub ou no DockerStore  
docker ps                                                       --> lista os containers ativos no momento  
docker ps -a                                                    --> exibe todos os containers criados, inclusive os parados  
docker start (id do container)                                  --> starta um docker específico  
docker stop (id do container)                                   --> para um docker específico  
docker stop -t 0                                                --> mata o container instantâneamente  
docekr start --help                                             --> mostra as opções de flah para se utilizarem junto com o comando start  
docker start -a -i                                              --> starta em um docker inativo em modo de interação  
docker rm (id do container)                                     --> remove um container específico  
docker rm -f                                                    --> remove e força o stop do container autmaticamente  
docker container prune                                          --> remove todos os containers  
docker images                                                   --> lista as imagens  
docker rmi (nome da imagem)                                     --> remove uma imagem específica  
docker run -d dockersamples/static-site                         --> Roda o container específicado em backgroud  
docker run -d -P dockersamples/static-site                      --> Roda o container específicado em backgroud e atribui portas aleatórias  
docker port (id do container)                                   --> Mostra a porta a qual o container está atribuido  
docker run -d -p 12345:80 dockersamples/static-site             --> Atribui uma porta específica do localhost para a porta 80 do container  
docker run -d -P -e AUTHOR="Pedro H" dockersamples/static-site  --> Seta uma variável de ambiente, no caso a variável AUTHOR dentro do container.  
docker ps -q                                                    --> traz apenas os ids do container  
docker stop -t 0 $(docker ps -q)                                --> será executado o comando stop para o resultado da busca que está entre parênteses.  
docker run -v "/var/www" ubuntu                                 --> cria em um diretório aleatório uma pasta para salvar registros e quando ela for deletada os registros irão persistir  
docker inspect (id do container)                                --> inspeciona as informações do container, prestar atenção no "Mounts"  
docker run -it -v "C:\Users\Alura\Desktop:/var/www" ubuntu      --> permite que especifique-mos alguma pasta específica.  
docker build -f Dockerfile -t pedroh/node                       --> constrói a imagem que sera distribuida, passando a tag -f para indicar o nome do arquivo que no caso é Dockerfile logo em seguida a flag -t para "tagear" a imagem, seguida do nome do usuário qeu criou a imagem e o nome da imagem.  
docker network crea --driver bridge minha-rede                  --> cria uma rede  
  
https://www.it-swarm.dev/pt/docker/como-atribuo-um-mapeamento-de-porta-um-conteiner-existente-do-docker/1041414424/  
_______________________________________________________________________________________________________________________  
  
  
docker run ubuntu echo "Ola mundo"  --> a partir da imagem baixada, utiliza o comando echo "Olha mundo"  
docker run -it ubuntu               --> baixa a imagem e já começa a utiliza-lá no modo interativo  
docker run dockersamples/static-site --> caso a imagem não seja oficial, é necessário específicar o usuári/NomeDaImagem  
  
_______________________________________________________________________________________________________________________  
  
  
ctrl + D --> sai do container  
  
_______________________________________________________________________________________________________________________  
  
  
CAPITULO 2 DOCKER  
  
Aprendemos neste capítulo:  
  
Comandos básicos do Docker para podermos baixar imagens e interagir com o container.  
Imagens do Docker possuem um sistema de arquivos em camadas (Layered File System) e os benefícios dessa abordagem principalmente para o download de novas imagens.  
Imagens são Read-Only sempre (apenas para leitura)  
Containers representam uma instância de uma imagem  
Como imagens são Read-Only os containers criam nova camada (layer) para guardar as alterações  
O comando Docker run e as possibilidades de execução de um container  
Segue também uma breve lista dos comandos utilizados:  
  
docker ps - exibe todos os containers em execução no momento.  
docker ps -a - exibe todos os containers, independentemente de estarem em execução ou não.  
docker run -it NOME_DA_IMAGEM - conecta o terminal que estamos utilizando com o do container.  
docker start ID_CONTAINER - inicia o container com id em questão.  
docker stop ID_CONTAINER - interrompe o container com id em questão.  
docker start -a -i ID_CONTAINER - inicia o container com id em questão e integra os terminais, além de permitir interação entre ambos.  
docker rm ID_CONTAINER - remove o container com id em questão.  
docker container prune - remove todos os containers que estão parados.  
docker rmi NOME_DA_IMAGEM - remove a imagem passada como parâmetro.  
docker run -d -P --name NOME dockersamples/static-site - ao executar, dá um nome ao container.  
docker run -d -p 12345:80 dockersamples/static-site - define uma porta específica para ser atribuída à porta 80 do container, neste caso 12345.  
docker run -d -P -e AUTHOR="Fulano" dockersamples/static-site - define uma variável de ambiente AUTHOR com o valor Fulano no container criado.  
  
_______________________________________________________________________________________________________________________  
  
  
VOLUME CAPITUL O3  
  
Primeiramente, como vamos rodar um código em Node.js, precisamos utilizar a sua imagem:  
  
docker run node  
Além disso, precisamos criar um volume, que faça referência à pasta do código no nosso Desktop:  
  
docker run -v "C:\Users\Alura\Desktop\volume-exemplo:/var/www" node  
  
Agora, para iniciar o seu servidor, executamos o comando npm start. Para executar um comando dentro do container, podemos iniciá-lo no modo interativo ou passá-lo no final do docker run:  
  
docker run -v "C:\Users\Alura\Desktop\volume-exemplo:/var/www" node npm start  
  
Por fim, esse servidor roda na porta 3000, então precisamos linkar essa porta a uma porta do nosso computador, no caso a 8080. O comando ficará assim:  
  
docker run -p 8080:3000 -v "C:\Users\Alura\Desktop\volume-exemplo:/var/www" node npm start  
  
Executado o comando, recebemos um erro. Nele podemos verificar a seguinte linha:  
  
npm ERR! enoent ENOENT: no such file or directory, open '/package.json'  
  
Então devemos especificar que o comando npm start deve ser executado dentro da pasta /var/www. Para isso, vamos passar a flag -w (Working Directory), para dizer em qual diretório o comando deve ser executado, a pasta /var/www:  
  
docker run -p 8080:3000 -v "C:\Users\Alura\Desktop\volume-exemplo:/var/www" -w "/var/www" node npm start  
  
---Melhorando o comando  
  
docker run -p 8080:3000 -v "$(pwd):/var/www" -w "/var/www" node npm start  
  
  
Nessas aulas avançamos bastante e aprendemos:  
  
Que Container são voláteis, isso é, ao remover um, removemos os dados juntos  
Para deixar os dados persistente devemos usar Volumes  
Que volumes salvos não ficam no container e sim no Docker Host  
Como criar um ambiente de execução node.js  
Segue também uma breve lista dos comandos utilizados:  
  
docker run -v "[CAMINHO_VOLUME_LOCAL:]CAMINHO_VOLUME_CONTAINER" NOME_DA_IMAGEM - cria um volume no respectivo caminho do container, caso seja especificado um caminho local monta o volume local no volume do container.  
docker inspect ID_CONTAINER - retorna diversas informações sobre o container.  
  
_______________________________________________________________________________________________________________________  
  
  
CAPITULO 4  
  
DOCKER FILE  
  
FROM node:latest  
MAINTAINER Douglas Quintanilha  
COPY . /var/www  
WORKDIR /var/www  
RUN npm install  
ENTRYPOINT npm start  
EXPOSE 3000  
  
Para colocarmos a imagem que criamos com o DockerFile no Dockerhub devemos criar uma conta no site do docker   
abrir o cmd e digitar   
docker login --> para fazermos login com a conta criada no site do docker  
  
depois utilizar o comando ""docker push nomedaconta/nomecontainer""  
  
  
Aprendemos neste capítulo:  
  
A entender o papel do arquivo DockerFile para criar imagens.  
O Dockerfile define os comandos para executar instalações complexas e com características específicas.  
Vimos os principais comandos como FROM, MAINTAINER, COPY, WORKDIR, RUN, EXPOSE e ENTRYPOINT  
A subir uma imagem criada através de um Dockerfile para o Docker Hub e disponibilizar para os desenvolvedores  
Lembrando também:  
  
as imagens são read-only sempre  
um container é uma instância de uma imagem  
para guardar as alterações a docker engine cria uma nova layer em cima da última layer da imagem  
Segue também uma breve lista dos comandos utilizados:  
  
docker build -f Dockerfile - cria uma imagem a partir de um Dockerfile.  
docker build -f CAMINHO_DOCKERFILE/Dockerfile -t NOME_USUARIO/NOME_IMAGEM - constrói e nomeia uma imagem não-oficial informando o caminho para o Dockerfile.  
docker login - inicia o processo de login no Docker Hub.  
docker push NOME_USUARIO/NOME_IMAGEM - envia a imagem criada para o Docker Hub.  
docker pull NOME_USUARIO/NOME_IMAGEM - baixa a imagem desejada do Docker Hub.  
