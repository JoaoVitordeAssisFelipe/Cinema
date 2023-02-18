# Cinema
Um cinema tem:
– Uma ou várias Salas que são ocupadas por pessoas e uma lista de filmes em cartaz.
– Toda Sala suporta um número máximo de n pessoas e tem um número que a identifica e
que não pode ser mudado.
– Toda Sala tem associada a ela um Filme (que após ser exibido pode ser alterado).
– Para todo Filme deseja-se cadastrar seu nome, duração máxima (em minutos), ano
de lançamento e a categoria.
– A Categoria pode ser: AVENTURA, COMÉDIA, DRAMA, SUSPENSE ou TERROR.
– Uma Pessoa ocupa uma Sala e tem como atributo o seu Bilhete e a idade.
– Um Bilhete tem um número e data.
Regras:
- Uma Pessoa não pode ocupar a mesma sala com o mesmo número de Bilhete que outra;
- Menores de idade não podem assistir filmes de TERROR, caso contrário, uma
mensagem “Não é permitido” deve ser exibida;
- Nessa aplicação, considere que cada filme tem somente uma única categoria.
Teste:
- Crie uma instância da classe Cinema.
- Crie também três filmes e adicione-os à lista de filmes em cartaz neste cinema.
- Crie um objeto da classe Sala que tenha 7 como número identificador e que suporte no
máximo 50 pessoas.
- A sala 7 deve exibir o filme intitulado “Orientado a Objetos”, que foi lançado em 2023,
tem duração de 180min e sua categoria é TERROR.
- Tente incluir três pessoas nesta sala, sendo apenas 1 pessoa menor de idade.

- Liste todos os filmes que estão em cartaz.
- Liste todas as pessoas que vão assistir o filme acima na sala 7.
