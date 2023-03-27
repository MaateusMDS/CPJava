### Citiflix

### Explicações
Projeto desenvolvido em volta de conceitas do Spring Framework, onde iremos realizar um CRUD por meio de uma API.  

### Endpoints
🟡 Post - http://localhost:8080/filme | <b>Body</b> <br>
🟢 Get - http://localhost:8080/filme <br>
🔴 Del - http://localhost:8080/filme/<em>ID_FILME</em> <br>
🔵 Put - http://localhost:8080/filme/<em>ID_FILME</em> | <b>Body</b>

<hr>


### Dados para inserir
<details>
<summary>Inserir filme</summary>


```
    {
    "titulo": "A Origem",
    "atorPrincipal": "Leonardo DiCaprio",
    "duracao": 148,
    "anoLancamento": 2010,
    "genero": "Ficcao",
    "fichaTecnica": {
			"direcao": "Christopher Nolan",
			"elenco": "Leonardo DiCaprio, Ellen Page, Joseph Gordon-Levitt",
			"roteiro": "Christopher Nolan",
			"classificacaoIndicativa": 14,
			"producao": "Warner Bros."
			}
    }
```

```	
    {
    "titulo": "O Poderoso Chefão",
    "atorPrincipal": "Marlon Brando",
    "duracao": 175,
    "anoLancamento": 1972,
    "genero": "Drama",
    "fichaTecnica": {
			"direcao": "Francis Ford Coppola",
			"elenco": "Marlon Brando, Al Pacino, James Caan",
			"roteiro": "Mario Puzo, Francis Ford Coppola",
			"classificacaoIndicativa": 16,
			"producao": "Paramount Pictures"
			}
    }
```

```
    {
    "titulo": "Os Sete Samurais",
    "atorPrincipal": "Toshiro Mifune",
    "duracao": 207,
    "anoLancamento": 1954,
    "genero": "Acao",
    "fichaTecnica": {
			"direcao": "Akira Kurosawa",
			"elenco": "Toshiro Mifune, Takashi Shimura",
			"roteiro": "Akira Kurosawa, Shinobu Hashimoto, Hideo Oguni",
			"classificacaoIndicativa": 12,
			"producao": "Toho"
			}
    }
```

```
    {
    "titulo": "O Silêncio dos Inocentes",
    "atorPrincipal": "Anthony Hopkins",
    "duracao": 118,
    "anoLancamento": 1991,
    "genero": "Suspense",
    "fichaTecnica": {
			"direcao": "Jonathan Demme",
			"elenco": "Jodie Foster, Anthony Hopkins",
			"roteiro": "Ted Tally",
			"classificacaoIndicativa": 18,
			"producao": "Orion Pictures"
			}
    }
```

```
    {
       "titulo": "A Viagem de Chihiro",
       "atorPrincipal": "Rumi Hiiragi",
       "duracao": 125,
       "anoLancamento": 2001,
			"genero": "Animacao",
			"fichaTecnica": {
				"direcao": "Hayao Miyazaki",
				"elenco": "Rumi Hiiragi, Miyu Irino, Mari Natsuki",
				"roteiro": "Hayao Miyazaki",
				"classificacaoIndicativa": 10,
				"producao": "Studio Ghibli"
			}
    }
```
</details>
<details>
<summary>Atualizar filme</summary>

```
    {
    "titulo": "Os Oito Samurais",
    "atorPrincipal": "Toshiro Mifune",
    "duracao": 201,
    "genero": "Acao",
			"classificacaoIndicativa": 18,
			}
    }
```

</details>
<hr>

### Créditos

Projeto desenvolvido por Mateus Mendes e Matheus Gomes para atividade da FIAP.
