<p>Baixar o git no site -> https://git-scm.com/downloads</p>
<p>Criar conta no github</p>
<p>Abrir a pasta com o terminal do git ("git bash here")</p>
<p>Configurar um usuario e nome global com os comandos </p>
    <p>git config --global user.email "pedrotxc@gmail.com"</p>
    <p>git config --global user.name "Pedro Henrique"</p>
<p>Adicionar um repositório para onde o código será enviado com o comando</p>
    <p>git remote add origin https://github.com/pedrotxc/barbearia-alura</p>
<p>Inicializar o repositório com os comandos</p>
    <p>git init</p>
    <p>git status</p>
    <p>git add .</p>
    <p>git commit -m "commit inicial"</p>
<p></p>
<p>…or create a new repository on the command line</p>
<p>echo "# nice-admin" >> README.md</p>
<p>git init</p>
<p>git add README.md</p>
<p>git commit -m "first commit"</p>
<p>git branch -M main</p>
<p>git remote add origin https://github.com/pedrotxc/nice-admin.git</p>
<p>git push -u origin main</p>
<p></p>
<p>…or push an existing repository from the command line</p>
<p>git remote add origin https://github.com/pedrotxc/nice-admin.git</p>
<p>git branch -M main</p>
<p>git push -u origin main</p>
<p></p>
<p>-------------------------------------------</p>
<p></p>
<p>git clean -d -f                                 --> Apaga os diretorios unchecked, a tag -d é para diretorio e -f é para os arquivos dentro dele</p>
<p>git checkout .                                  --> apaga os arquivos que não são para dar status. </p>
<p>git init                                        --> incializar um repositório local dentro da estrutura</p>
<p>git clone                                       --> obter uma estrutura de projeto de um projeto remoto</p>
<p>git add . ou git add <<nome_arquivo>>           --> adicionar arquivos para que o possam ser commitados</p>
<p>git commit -m 'mensagem de commit'              --> vai commitar o arquivo e especificar a mensagem que vamos utilizar</p>
<p>git push                                        --> forma de publicar as alterações em um servidor remoto</p>
<p>git push origin <<nome da branch>>              --> envia uma outra branch para o repositório remoto</p>
<p>git pull                                        --> baixa as alterações do repositório remoto para o repositório local</p>
<p>git merge                                       --> junta as alterações de uma brench e de alguma outra brench</p>
<p>git status                                      --> vai trazer os status dos arquivos que foram alterados</p>
<p>git log                                         --> traz um histórico dos commits feito no repositório</p>
<p>git log --status                                --> consulta os commits e traz saus estatísticas abreviadas.</p>
<p>git branch                                      --> mostra a lista de branchs criadas</p>
<p>git checkout <<nome da branch>>                 --> trocar de branch</p>
<p>git checkout -b <<nome da branch>>              --> cria uma nova branch e já troca para ela</p>
<p>git branch -D <<nome da branch>>                --> remove a branch</p>
<p>git branch <<nome da branch>>                   --> cria um novo ramo</p>
<p>git remote add origin (link github)             --> adicionar origen de repositório local</p>
<p>git remote rm origin                            --> remover a origen de repositório remoto</p>
<p>git branch -m master                            --> renomeia a branch para master</p>
<p>git remote                                      --> lista os repositório remoto</p>
<p>git remote -v                                   --> lista os repositório até a url</p>
<p>git reset HEAD <<nome do arquivo>>              --> reseta o commit</p>
<p>git reset --hard HEAD~1                         --> remove o commit</p>
<p>git push origin +branchName(master) --force     --> força um push no github</p>
<p>git commit --amend -m "New commit message."     --> change the message of the last commit</p>
<p></p>
<p>mkdir projeto-curso-git</p>
<p>cd projeto-curos-git/</p>
<p>git init</p>
<p>touch index.html</p>
<p>git status</p>
<p>____________________________________________________________________________________________________________________________</p>
<p>Trabalhando com Branchs</p>
<p></p>
<p>Comandos pelo terminal 1:</p>
<p>Além da opção Doougui, você pode usar comando no terminal:</p>
<p></p>
<p>git checkout -b MinhaNovaBrach</p>
<p></p>
<p>Depois, quando quiser subir a branch, faça os commits:</p>
<p>git commit -m 'Comentário do commit da minha nova branch'</p>
<p></p>
<p>Depois, subindo de fato:</p>
<p>git push --set-upstream origin MinhaNovaBrach</p>
<p></p>
<p>-----</p>
<p></p>
<p>Também pelo terminal 2:</p>
<p></p>
<p>Para criar a nova branch a partir da branch que você está:</p>
<p>git branch MinhaNovaBrach</p>
<p></p>
<p>Para criar a nova branch a partir de uma branch especifica:</p>
<p>git branch -c branchEspecifica MinhaNovaBrach</p>
<p></p>
<p>Nos dois casos você precisa trocar para a branch criada, commitar e fazer o trancking:</p>
<p>git checkout MinhaNovaBrach</p>
<p>git commit -m "Olha que commit lindo <3"</p>
<p>git push -u origin MinhaNovaBrach</p>
<p>____________________________________________________________________________________________________________________________</p>
<p></p>
<p>Passo a passo para dar push em um repositório remoto sem maiores problemas:</p>
<p></p>
<p>Os comandos abaixo devem ser executados dentro de um repositório local, já inicializado com git init.</p>
<p></p>
<p>Adicione um repositório remoto:</p>
<p></p>
<p>git remote add origin https://usuario-e-repositorio-do-github-ou-bitbucket</p>
<p>(se tiver problemas com git remote add)</p>
<p></p>
<p>Por padrão, o comando git se recusa a mesclar históricos que não compartilham um ancestral comum. O primeiro comando abaixo será usado</p>
<p>para ignorar isso:</p>
<p></p>
<p>git pull --allow-unrelated-histories</p>
<p>Baixa o que tem no repositório remoto, faça mesmo que esteja vazio:</p>
<p></p>
<p>git pull origin master</p>
<p>Será adicionado ao stagging os arquivos do diretório e sub-diretórios que você está:</p>
<p></p>
<p>git add .</p>
<p>Identifique o que você vai subir...</p>
<p></p>
<p>git commit -m "Mensagem para esse push"</p>
<p>Faça o upload:</p>
<p></p>
<p>git push origin master</p>
<p>__________________________________________________________________________________________________________________________________________</p>
<p></p>
<p>Limpando o histórico de commits</p>
<p></p>
<p>Deleting the .git folder may cause problems in your git repository. If you want to delete all your commit history but keep the code in its</p>
<p>current state, it is very safe to do it as in the following:</p>
<p></p>
<p>Checkout</p>
<p></p>
<p>git checkout --orphan latest_branch</p>
<p></p>
<p>Add all the files</p>
<p></p>
<p>git add -A</p>
<p></p>
<p>Commit the changes</p>
<p></p>
<p>git commit -am "commit message"</p>
<p></p>
<p>Delete the branch</p>
<p></p>
<p>git branch -D master</p>
<p></p>
<p>Rename the current branch to master</p>
<p></p>
<p>git branch -m master</p>
<p></p>
<p>Finally, force update your repository</p>
<p></p>
<p>git push -f origin master</p>
<p></p>
<p>PS: this will not keep your old commit history around</p>
<p>______________________________________________________________________________________________________________________________</p>
