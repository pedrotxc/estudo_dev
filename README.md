# estudo_dev

<p>Baixar o git no site -> https://git-scm.com/downloads</p>
Criar conta no github
Abrir a pasta com o terminal do git ("git bash here")
Configurar um usuario e nome global com os comandos 
    git config --global user.email "pedrotxc@gmail.com"
    git config --global user.name "Pedro Henrique"
Adicionar um repositório para onde o código será enviado com o comando
    git remote add origin https://github.com/pedrotxc/barbearia-alura
Inicializar o repositório com os comandos
    git init
    git status
    git add .
    git commit -m "commit inicial"

…or create a new repository on the command line
echo "# nice-admin" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/pedrotxc/nice-admin.git
git push -u origin main

…or push an existing repository from the command line
git remote add origin https://github.com/pedrotxc/nice-admin.git
git branch -M main
git push -u origin main

-------------------------------------------

git clean -d -f                                 --> Apaga os diretorios unchecked, a tag -d é para diretorio e -f é para os arquivos dentro dele
git checkout .                                  --> apaga os arquivos que não são para dar status. 
git init                                        --> incializar um repositório local dentro da estrutura
git clone                                       --> obter uma estrutura de projeto de um projeto remoto
git add . ou git add <<nome_arquivo>>           --> adicionar arquivos para que o possam ser commitados
git commit -m 'mensagem de commit'              --> vai commitar o arquivo e especificar a mensagem que vamos utilizar
git push                                        --> forma de publicar as alterações em um servidor remoto
git push origin <<nome da branch>>              --> envia uma outra branch para o repositório remoto
git pull                                        --> baixa as alterações do repositório remoto para o repositório local
git merge                                       --> junta as alterações de uma brench e de alguma outra brench
git status                                      --> vai trazer os status dos arquivos que foram alterados
git log                                         --> traz um histórico dos commits feito no repositório
git log --status                                --> consulta os commits e traz saus estatísticas abreviadas.
git branch                                      --> mostra a lista de branchs criadas
git checkout <<nome da branch>>                 --> trocar de branch
git checkout -b <<nome da branch>>              --> cria uma nova branch e já troca para ela
git branch -D <<nome da branch>>                --> remove a branch
git branch <<nome da branch>>                   --> cria um novo ramo
git remote add origin (link github)             --> adicionar origen de repositório local
git remote rm origin                            --> remover a origen de repositório remoto
git branch -m master                            --> renomeia a branch para master
git remote                                      --> lista os repositório remoto
git remote -v                                   --> lista os repositório até a url
git reset HEAD <<nome do arquivo>>              --> reseta o commit
git reset --hard HEAD~1                         --> remove o commit
git push origin +branchName(master) --force     --> força um push no github
git commit --amend -m "New commit message."     --> change the message of the last commit

mkdir projeto-curso-git
cd projeto-curos-git/
git init
touch index.html
git status
____________________________________________________________________________________________________________________________
Trabalhando com Branchs

Comandos pelo terminal 1:
Além da opção Doougui, você pode usar comando no terminal:

git checkout -b MinhaNovaBrach

Depois, quando quiser subir a branch, faça os commits:
git commit -m 'Comentário do commit da minha nova branch'

Depois, subindo de fato:
git push --set-upstream origin MinhaNovaBrach

-----

Também pelo terminal 2:

Para criar a nova branch a partir da branch que você está:
git branch MinhaNovaBrach

Para criar a nova branch a partir de uma branch especifica:
git branch -c branchEspecifica MinhaNovaBrach

Nos dois casos você precisa trocar para a branch criada, commitar e fazer o trancking:
git checkout MinhaNovaBrach
git commit -m "Olha que commit lindo <3"
git push -u origin MinhaNovaBrach
____________________________________________________________________________________________________________________________

Passo a passo para dar push em um repositório remoto sem maiores problemas:

Os comandos abaixo devem ser executados dentro de um repositório local, já inicializado com git init.

Adicione um repositório remoto:

git remote add origin https://usuario-e-repositorio-do-github-ou-bitbucket
(se tiver problemas com git remote add)

Por padrão, o comando git se recusa a mesclar históricos que não compartilham um ancestral comum. O primeiro comando abaixo será usado
para ignorar isso:

git pull --allow-unrelated-histories
Baixa o que tem no repositório remoto, faça mesmo que esteja vazio:

git pull origin master
Será adicionado ao stagging os arquivos do diretório e sub-diretórios que você está:

git add .
Identifique o que você vai subir...

git commit -m "Mensagem para esse push"
Faça o upload:

git push origin master
__________________________________________________________________________________________________________________________________________

Limpando o histórico de commits

Deleting the .git folder may cause problems in your git repository. If you want to delete all your commit history but keep the code in its
current state, it is very safe to do it as in the following:

Checkout

git checkout --orphan latest_branch

Add all the files

git add -A

Commit the changes

git commit -am "commit message"

Delete the branch

git branch -D master

Rename the current branch to master

git branch -m master

Finally, force update your repository

git push -f origin master

PS: this will not keep your old commit history around
______________________________________________________________________________________________________________________________
