# Ludmila Mariana Chagas

## Introdução

Olá, seja bem-vindo! Meu nome é Ludmila Mariana Chagas e sou estudante do tecnólogo de Banco de Dados na Fatec Profº Jessen Vidal, em São José dos Campos.

![Untitled](https://github.com/ludmila-chagas/bertoti/assets/81494654/a054d5f3-2b54-437a-82d8-93f470587cf0)

## Principais conhecimentos

Comecei a programar em um curso de técnico, sendo minha linguagem ingressante C++. Lá aprendi o básico de lógica de programação, porém foi na Fatec que desenvolvi com profundidade meus conhecimentos em Programação Orientada a Objetos e principalmente em Java, sendo hoje minha principal linguagem utilizada. Meu foco está no desenvolvimento backend, com implementações de webservices especialmente pelo framework Springboot.

# Índice
 
<details>
<summary>Projeto 1: 1º semestre 2021</summary>

- [Início Projeto 1](#projeto-1-1º-semestre-2021)
- [Visão do Projeto](#visão-do-projeto)
- [Principais tecnologias](#principais-tecnologias)
- [Contribuições pessoais](#contribuições-pessoais)
- [Aprendizados Efetivos HS](#aprendizados-efetivos-hs)
</details>

<details>
<summary>Projeto 2: 2º semestre 2021</summary>

- [Início Projeto 2](#projeto-2-2º-semestre-2021)
- [Visão do Projeto](#visão-do-projeto-1)
- [Principais tecnologias](#principais-tecnologias-1)
- [Contribuições pessoais](#contribuições-pessoais-1)
- [Aprendizados Efetivos HS](#aprendizados-efetivos-hs-1)
</details>

<details>
<summary>Projeto 3: 1º semestre 2023</summary>

- [Início Projeto 3](#projeto-3-1º-semestre-2023)
- [Visão do Projeto](#visão-do-projeto-2)
- [Principais tecnologias](#principais-tecnologias-2)
- [Contribuições pessoais](#contribuições-pessoais-2)
- [Aprendizados Efetivos HS](#aprendizados-efetivos-hs-2)
</details>

<details>
<summary>Projeto 4: 2º semestre 2023</summary>

- [Início Projeto 4]
- [Visão do Projeto]
- [Principais tecnologias]
- [Contribuições pessoais]
- [Aprendizados Efetivos HS]
</details>

---

# [Projeto 1: 1º semestre 2021](https://github.com/silvercod3/Athena)

#### 1º Semestre do Curso | Parceiro Acadêmico: Professor Fabiano Sabha

---

### Visão do Projeto

O propósito do projeto foi trazer para os estudantes em geral uma forma mais centralizada e organizada de cuidar da vida acadêmica e se manter atualizado em suas atividades através de uma assistente pessoal de estudos, a Athena, tendo como diferencial é reunir diversas ferramentas úteis em um único lugar. Seu funcionamento é exclusivamente via comandos de voz.

---

### Principais tecnologias

- Python
- SQLite
- SpeechRecognition
- PyAudio

#### Python

Linguagem de programação de alto nível, amplamente utilizada devido à sua simplicidade e legibilidade, sendo muito recomendável para programadores iniciantes. Possibilita desenvolvimento de aplicações web, ciência de dados, Inteligência Artificial e Machine Learnig, automação, jogos, aplicativos desktop entre outros, destacando-se também pela vasta biblioteca de suporte.

#### SQLite

SQLite é um banco de dados leve e autônomo amplamente utilizado em aplicativos móveis e projetos menores. Sua simplicidade de uso, eficiência e capacidade de armazenamento organizado através da linguagem SQL o tornam uma escolha popular para integração de bancos de dados em aplicações com baixo impacto.

#### SpeechRecognition

Essa biblioteca em Python oferece recursos para o reconhecimento de fala em tempo real. Com ela, é possível capturar áudio e convertê-lo em texto, permitindo a interação por meio da voz em aplicativos e sistemas. Amplamente utilizada para transcrição de áudio e automação de tarefas baseadas em comandos de voz.

#### PyAudio

Biblioteca em Python que fornece recursos para gravação e reprodução de áudio em tempo real. Com ela, é possível capturar áudio de microfones, reproduzir arquivos de áudio e até mesmo fazer streaming de áudio pela rede. É amplamente utilizada em aplicações que envolvem processamento de áudio, como reconhecimento de fala, aplicações musicais e sistemas de comunicação por voz.

---

### Contribuições pessoais

Nesse projeto atuei pela primeira vez como desenvolvedora e também como um ponto de apoio para implementação da metodologia ágil Scrum no time, visto que já tinha experiência com ela no meu trabalho formal (que não era na área), então fortaleci no engajamento dos rituais para que o trabalho em equipe fluísse da melhor forma possível.

Dentre as funcionalidades que desenvolvi, estão:

<details>
<summary>Dicas de estudos</summary>
<p>Através de pesquisas fiz uma base de dados com dicas de estudo para popular nossa assistente, com a utilização do módulo sqlite3 para interagir com um banco de dados SQLite. O código se conecta ao banco de dados dicas_athena.db, cria um cursor para executar comandos SQL e contém comandos para criar uma tabela chamada "dicas" e inserir várias dicas de estudo nessa tabela. No final, o comando banco.commit() é usado para confirmar as alterações no banco de dados. Essas dicas posteriormente serviram para consulta pelo usuário da aplicação.</p>

Trecho do código:

```
import sqlite3

banco = sqlite3.connect('dicas_athena.db')

cursor = banco.cursor()

# CÓDIGO PARA CRIAÇÃO DA TABELA: cursor.execute("CREATE TABLE dicas (dicas text)")

# CÓDIGO PADRÃO PARA INSERÇÃO DE DADOS NA TABELA: cursor.execute("INSERT INTO dicas VALUES ('')")

#cursor.execute("INSERT INTO dicas VALUES ('Defina metas e depois, divida essas metas em elementos menores. Em vez de pensar em estudar 10 capítulos de uma vez, leia 2 por dia, por exemplo.')")
#cursor.execute("INSERT INTO dicas VALUES ('Crie objetivos diários, semanais e mensais. É um jeito de acompanhar seu progresso e de ver o que ainda precisa de atenção extra.')")
#cursor.execute("INSERT INTO dicas VALUES ('Escolha um bom lugar de estudos. Selecionar uma área desconfortável ou improvisada demais vai comprometer o seu desempenho. O ideal é escolher um lugar tranquilo, com boa iluminação e boa temperatura.')")
#cursor.execute("INSERT INTO dicas VALUES ('Faça com que o espaço esteja sempre arrumado para não causar distrações. Após finalizar um dia de estudo, deixe o ambiente pronto para o seguinte. Assim, facilita manter a organização.')")
#cursor.execute("INSERT INTO dicas VALUES ('Um modo de manter a sua motivação no alto é se recompensar por cumprir metas. Pode ser bem simples: um chocolate após o estudo de um capítulo ou um episódio da sua série favorita são boas recompensas.')")

#banco.commit()
```

</details>

<details>
<summary>Cadastro de disciplinas e metas de estudo</summary>
<p>Desenvolvi uma lógica interativa para cadastro de matérias de estudo, definição de metas de estudo (semanal, quinzenal ou mensal) e registro de horas estudadas por matéria. O programa utiliza loops while para permitir ao usuário cadastrar múltiplas matérias, definir metas e adicionar horas estudadas. Os dados são armazenados em uma lista e escritos em um arquivo de texto. Além disso, via comando SQL os dados também são inseridos em uma tabela do banco de dados.</p>

Trecho do código:

```
while True:
    materia_cadastro = str(input('Qual matéria gostaria de cadastrar: ')).strip()
    materia.append(materia_cadastro)
    resp = str(input('Gostaria de cadastrar outra materia ? [s/n]: ')).strip().lower()[0]
    if resp != "n":
        if resp == "s":
            continue
        else:
            print('Dado inconsistente, tente novamente')
            continue
    else:
        break
print(''' Defina uma meta
 [1] - Meta semanal
 [2] - Meta quinzenal
 [3] - Meta mensal''')
while True:
    resp_meta = int(input('Qual a meta desejada ?: '))
    if resp_meta not in range(1, 4):
        print('Valor digitado incorreto, tente novamente por gentileza')
        continue
    else:
        if resp_meta == 1:
            for c in materia:
                time = str(input(f'Digite quantas horas para sua meta SEMANAL. - Matéria: "{c}" [hh:mm]: ')).strip().replace(" ", ":").replace(" e ", ":")
                tempo_estudado.append(time)
        if resp_meta == 2:
            for c in materia:
                time = str(input(f'Digite quantas horas para sua meta QUINZENAL. - Matéria: "{c}" [hh:mm]: ')).strip().replace(" ", ":").replace(" e ", ":")
                tempo_estudado.append(time)
        if resp_meta == 3:
            for c in materia:
                time = str(input(f'Digite quantas horas para sua meta MENSAL. - Matéria: "{c}" [hh:mm]: ')).strip().replace(" ", ":").replace(" e ", ":")
                tempo_estudado.append(time)
    break
while True:
    resp_hora = str(input('Para qual matéria gostaria de adcionar horas estudadas ?: '))
    if resp_hora not in materia:
        print('Não encontrei essa matéria, tente novamente')
        continue
    else:
        hora = str(input(f'Quantas horas gostaria de cadastrar para a matéria "{resp_hora}" [hh:mm]: '))
        hora_estudada.append(hora)
        continuar = str(input('Gostaria de continuar ? [s/n]: ')).strip().lower()[0]
        if continuar != "n":
            if continuar == "s":
                continue
            else:
                print('Dado inconsistente, tente novamente')
                continue
        else:
            break
with open("novo_dado.txt", "a+", encoding='utf-8') as arquivo:
    for pos, c in enumerate(materia):
        arquivo.write(f"Matéria: {materia[pos]} - Tempo/Meta = {tempo_estudado[pos]} - Hora estudada {hora_estudada[pos]}\n" )
        vsql = "INSERT INTO Metas (MATERIA,META,HORA_ESTUDADA)VALUES('"+materia[pos]+"','"+tempo_estudado[pos]+"','"+hora_estudada[pos]+"')"
        inserir(vcon, vsql)
```

</details>
 
 ### Aprendizados Efetivos em Hard Skills

Através dessse projeto tive uma pequena noção da dimensão de possibilidades de desenvolvimento através da programação, pois nunca tinha participado de algo tão complexo quanto ele. Meus destaques de aprendizados são:

- Banco de dados (em memória) e comandos básicos do SQL;
- Programação na linguagem Python;
- Modelar um banco de dados simples;
- Uso de estruturas de repetição e condições (while e if);
- Utilizar bibliotecas para viabilização do projeto;

### Aprendizados Efetivos em Soft Skills

Já em relação as soft skills posso destacar:

- Trabalho em equipe;
- Trabalho remoto (o semestre foi concluído de forma remota por conta da pandemia de Covid-19);
- Comunicação clara e objetiva;
- Proatividade.


------
------
# Projeto 2: 2º semestre 2021

#### 2º Semestre do Curso | Parceiro Acadêmico: Necto Systems

### Visão do Projeto

Desenvolver uma solução para monitoramento de um ou mais SGBDs (Sistema Gerenciador de Banco de Dados) remotos, bem como na coleta de métricas de funcionamento dos Banco de Dados presentes nos servidores da empresa, sendo essa solução um software integrado que monitora e apresenta métricas referentes ao uso e a saúde do SGBD em tempo real.

---

### Principais tecnologias

- Java
- PostgreSQL

#### Java

Linguagem de programação de alto nível conhecida por sua robustez e portabilidade. Com uma sintaxe intuitiva e orientação a objetos, é uma escolha popular para desenvolvimento de software escalável, aplicações empresariais e sistemas embarcados.

#### PostgreSQL

Banco de dados relacional altamente confiável e flexível, que conta com recursos avançados e suporte para consultas complexas. Sua comunidade ativa e atualizações regulares garantem sua eficiência e segurança. Uma escolha confiável para armazenar e gerenciar dados com excelência.

---

### Contribuições pessoais
Novamente atuando como desenvolvedora, por esse projeto tive meu primeiro contato com conexão com banco de dados relacional, e foi nele que aprendi como configurar essa conexão e também consultas úteis para se fazer, bem como criar funções em Java e utilizar programação orientada a objetos.


<details>
<summary>Conexão com banco de dados e consultas no </summary>
<p>No código, foram criados dois métodos em Java para recuperar consultas com base em tempos de execução. O método gettopQuickQuery() retorna as consultas com menor tempo de execução lendo o número de consultas de um arquivo queries.txt, enquanto getTopSlowestQueries() retorna as consultas com maior tempo de execução. Ambos os métodos usam um HashMap para armazenar os resultados e lidam com erros durante a execução das consultas SQL. Esses métodos visam monitorar e otimizar o desempenho do banco de dados.</p>
 
Trecho do código:

´´´

	private HashMap<String, String> gettopQuickQuery() {
		HashMap<String, String> response = new HashMap<>();
		
		ArrayList<String> queries = new ArrayList<String>();

		String path = "queries.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) {
                //System.out.println(line);
                line = br.readLine();
                queries.add(line);
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }
        
		String getquery = queries.get(0);

		try {
			String sql = "SELECT (total_exec_time / 1000 / 60) as total_minutes, query FROM pg_stat_statements ORDER BY  (total_exec_time / 1000 / 60) asc LIMIT " + getquery;

			PreparedStatement pesquisa = con.prepareStatement(sql);

			ResultSet result = pesquisa.executeQuery();

			while (result.next()) {
				response.put(result.getString("total_minutes"), result.getString("query"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(
					"Houve um problema ao requisitar as queries com menor tempo de execução de todos os banco de dados!");
		}

		return response;
	}

	private HashMap<String, String> getTopSlowestQueries() {
		HashMap<String, String> response = new HashMap<>();
		
		ArrayList<String> queries = new ArrayList<String>();
		
		String path = "queries.txt";
		
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) {
                //System.out.println(line);
                line = br.readLine();
                queries.add(line);
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }
        
		String getquery = queries.get(1);

		try {
			String sql = "SELECT (total_exec_time / 1000 / 60) as total_minutes, query FROM pg_stat_statements ORDER BY  (total_exec_time / 1000 / 60) desc LIMIT " + getquery;

			PreparedStatement pesquisa = con.prepareStatement(sql);

			ResultSet result = pesquisa.executeQuery();

			while (result.next()) {
				response.put(result.getString("total_minutes"), result.getString("query"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(
					"Houve um problema ao requisitar as queries com maior tempo de execução de todos os banco de dados!");
		}

		return response;
	}
´´´

</details>

### Aprendizados Efetivos em Hard Skills
Como meu primeiro projeto utilizando Java, foi uma ótima introdução a essa linguagem, me fazendo iniciar o aprendizado sobre os conceitos de programação orientada a objetos. Além disso, como citei, também foi a minha primeira experiência vinculando um software a um banco de dados relacional, então também tive a oportunidade de solidificar mais meu entendimento de SQL, aprender a fazer operações CRUD (Create, Read, Udate, Delete) e SGBDs (Sistemas Gerenciadores de Bancos de Dados). Meus detaques são:

- Entender um banco de dados relacional;
- Programar seguindo conceitos de POO (Programação Orientada a Objetos);
- Programar em Java;
- Como gerenciar um SGBD (PostgreSQL);
- Scripts mais avançados em SQL;

### Aprendizados Efetivos em Soft Skills
Como foi o primeiro projeto da faculdade onde nos relacionamos diretamente com o cliente, dando início a essa dinâmica enriquecedora, que não era um representante ds faculdade e sim uma empresa apoiadora, posso destacar como soft skills adquiridas:

- Interagir com um cliente real (empresa terceira), seguindo metodologia ágil Scrum;
- Adaptação na equipe de desenvolvimento com novos integrantes.


-----
-----

# Projeto 3: 1º semestre 2023

#### 3º Semestre do Curso | Parceiro Acadêmico: Dom Rock

### Visão do Projeto
A Dom Rock recebe a predição de vendas de seus clientes em formato csv tendo que padronizar todos os arquivos antes do uso, sendo assim sentiu necessidade de uma aplicação web que facilitaria a entrada destes dados em um padrão definido diminuindo o tempo gasto com a padronização. 
A solução proposta consiste em lidar com o histórico de movimentação de produtos (vendas e estoque), predição de faturamento (feito por um algoritmo de IA já existente) e a entrada de dados oriundas da força de vendas quanto ao planejamento futuro.

---

### Principais tecnologias

- Java
- Spring
- PostgreSQL
- HTML
- CSS
- Javascript

#### Spring
Framework de desenvolvimento de aplicativos Java que fornece um ambiente robusto para a criação de aplicativos empresariais escaláveis e de alta qualidade. Com recursos como injeção de dependência e controle transacional, o Spring facilita o desenvolvimento, a manutenção e a integração de sistemas complexos, permitindo que os desenvolvedores se concentrem na lógica de negócios.

#### HTML
Linguagem de marcação padrão para a criação de páginas da web. Utilizando tags e elementos, o HTML permite estruturar e organizar o conteúdo de uma página, incluindo textos, imagens, links e outros elementos interativos. É a base fundamental para a construção de sites e aplicativos web, fornecendo a estrutura básica e semântica para apresentar informações na internet.

#### CSS
Linguagem de estilo utilizada para definir a aparência e o layout de elementos em uma página da web. Com o CSS, é possível controlar cores, fontes, tamanhos, posicionamentos e outros aspectos visuais, permitindo a criação de interfaces atrativas e responsivas. Além disso, o CSS oferece recursos avançados, como animações e efeitos, para melhorar a experiência do usuário.

#### Javascript
Linguagem de programação versátil e amplamente utilizada no desenvolvimento web. Ela permite a criação de interatividade e dinamismo em páginas da web, possibilitando a manipulação de elementos HTML, a resposta a eventos do usuário e a comunicação com servidores. Com o JavaScript, é possível criar desde pequenos scripts até aplicativos web complexos, tornando a web mais dinâmica e envolvente para os usuários.

---

### Contribuições pessoais
Mais uma vez atuando como desenvolvedora, além de programar também atuei como ponto focal de boas práticas quanto ao versionamento de código, trazendo para o grupo conceitos de Gitflow e resolvendo conflitos de versoões constantemente. Além disso, me arrisquei a aprender e implementar testes unitários para garantir maior qualidade e robustez do código, aumentando a confiança na sua funcionalidade e facilitando futuras alterações. Outra menção importante foi minha atuação fundamental na etapa de entendimento da dor do cliente, bem como na definição de backlog e priorização de tasks por sprints, visto que já tinha uma habilidade com visualização de dados e criação de painéis, vinda de experiências profissionais.

<details>
<summary>Atualização de vendas estimadas (back e fronted)</summary>
<p>Implementei um método em Java com Spring Boot para atualizar vendas, verificando se a venda existe, se ainda não foi atualizada e se está dentro do prazo de 7 dias desde a criação (requisito do cliente). O método retorna mensagens específicas caso a venda já tenha sido atualizada, esteja fora do prazo ou não seja encontrada.</p>

 Trecho do código backend:
 
```

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	    @Transactional
	    @Modifying
	    @PutMapping("/atualizar_venda/{id_venda}/{quant_vendida}")
	    public ResponseEntity<Object> atualizarVenda(@PathVariable Long id_venda, @PathVariable Float quant_vendida) {
	        Venda venda = repository.findById(id_venda).orElse(null);
	
	        if (venda != null) {
	            if (venda.getAtualizada_em() == null) {
	                Date dataAtual = new Date();
	                Date dataCriacao = venda.getCriada_em();
	                long diff = dataAtual.getTime() - dataCriacao.getTime();
	                long diffDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	
	                if (diffDays <= 7) {
	                    venda.setQuant_vendida(quant_vendida);
	                    venda.setAtualizada_em(new Date());
	                    repository.save(venda);
	                    return ResponseEntity.ok().body("{\"message\": \"Venda atualizada com sucesso!\"}");
	                } else {
	                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Fora do prazo\"}");
	                }
	            } else {
	                return ResponseEntity.ok().body("{\"message\": \"Venda já atualizada\"}");
	            }
	        }
	
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\": \"Venda não encontrada\"}");
	    }
```

Trecho do código fronted:

```
function editar_vendas() {
  if (selectedRow) {
    const selectedId = selectedRow.getAttribute('data-id');
    console.log('Cadastro de Vendas - Linha selecionada. ID:', selectedId);
    const id_venda = selectedRow.querySelector(".id_venda").textContent;

    const quantidadeVendida = prompt('Informe a quantidade vendida:');

    const url = `http://localhost:8080/venda/atualizar_venda/${id_venda}/${quantidadeVendida}`;

    fetch(url, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json',
      },
    })
      .then(response => response.json())
      .then(data => {
        console.log(data);
        buscar(); 
      })
      .catch(error => {
        console.error('Erro na requisição:', error);
      });
    
    selectedRow.classList.remove('selected');
    selectedRow = null;
  } else {
    alert('Clique na linha que você deseja alterar.');
  }
}
```
 
</details>


<details>
<summary>Gráfico "Top 10 Produtos" mais vendidos (back e frontend)</summary>
<p>Implementei um método em Java com Spring Boot que retorna os top 10 produtos mais vendidos, utilizando uma consulta SQL para somar a quantidade vendida de cada produto e ordenar o resultado. O método utiliza o JdbcTemplate do Spring para executar a consulta e mapear o resultado para uma lista de mapas com o nome do produto e a quantidade total vendida.</p>

 Trecho do código backend:

```
   @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/topProdutos")
    public List<Map<String, Object>> getTopProdutos() {
        List<Map<String, Object>> topProdutos = new ArrayList<>();
        String sql = "SELECT p.nome_produto, " +
                "SUM(v.quant_vendida) AS total_vendido " +
                "FROM produto p " +
                "JOIN venda v ON p.cod_produto = v.fk_produto_cod_produto " +
                "GROUP BY p.nome_produto, v.fk_produto_cod_produto " +
                "ORDER BY total_vendido DESC " +
                "LIMIT 10";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> produto = new HashMap<>();
            produto.put("nome_produto", ((String) row.get("nome_produto")).trim());
            produto.put("total_vendido", row.get("total_vendido"));
            topProdutos.add(produto);
        }
        return topProdutos;
    }
```



 Trecho do código fronted:
```
function generateProdutosChart() {
  fetch("http://localhost:8080/produto/topProdutos")
    .then(function (response) {
      return response.json();
    })
    .then(function (data) {
      var dados = data.map(function (item) {
        return { y: item.nome_produto, a: item.total_vendido };
      });

      var config = {
        data: dados,
        xkey: "y",
        ykeys: "a",
        labels: ["Total"],
        fillOpacity: 0.6,
        hideHover: "auto",
        behaveLikeLine: true,
        resize: true,
        pointFillColors: ["#ffffff"],
        pointStrokeColors: ["black"],
        lineColors: ["#005eff"],
        xLabelAngle: 45,
      };

      config.element = "stackedProdutos";
      config.stacked = true;
      Morris.Bar(config);
    })
    .catch(function (error) {
      console.log(error);
    });
}
```


</details>


<details>
<summary>Implementação de testes unitários</summary>
<p>Neste código eu criei um teste unitário em Java utilizando o framework Spring Boot para testar a criação de um objeto Cliente a partir de um objeto ClienteRequestDTO. O teste verifica se os atributos do objeto Cliente são configurados corretamente com base nos valores fornecidos no ClienteRequestDTO.</p>

Trecho do código:

```
@SpringBootTest
class ClienteTest {

    @Test
    public void testCreateClienteFromDTO() {
        ClienteRequestDTO dto = new ClienteRequestDTO("Cliente 1", "Gerente 1", "Produto A", "Produto B", "Produto C");


        Cliente cliente = new Cliente(dto);

        assertEquals("Cliente 1", cliente.getNome_cliente());
        assertEquals("Gerente 1", cliente.getNome_gerencia());
        assertEquals("Produto A", cliente.getProduto_a());
        assertEquals("Produto B", cliente.getProduto_b());
        assertEquals("Produto C", cliente.getProduto_c());
    }
}
```

</details>


<details>
<summary>Modelagem do banco de dados</summary>
<p>Apesar de ser o terceiro semestre e de já ter ajudado no processo de modelagem anteriormente, foi minha primeira vez modelando o banco completo e totalmente sozinha, o que me fez criar total confiança de realizar esse processo de forma autônoma.</p>

![Modelo conceitual banco de dados](https://github.com/ludmila-chagas/bertoti/assets/81494654/e3964e56-252f-409e-816a-0ba14174fa06)

</details>

### Aprendizados Efetivos HS
Sendo o primeiro projeto com frontend em que atuei, foi muito importante aprender a manipular o processamento de dados em uma tela para o usuário final e fazer a parte de integração com backend. Além disso, o que antes eram conceitos que havia entendido superficialmente hoje já estão consolidados, principalmente a respeito de Java, por ser o segundo projeto com backend desenvolvido nessa linguagem. Os destaques desse semestre vão para:

- Consolidação de conhecimentos em Java;
- Introdução a desenvolvimento frontend (javascript, HTML e CSS);
- Utilização de ORM (Object Relational Mapper);
- Gitflow;
- Cultura de testes.

---
---

# Projeto 4: 2º semestre 2023

#### 4º Semestre do Curso | Parceiro Acadêmico: Jaia Software

### Visão do Projeto
O desafio consiste em desenvolver um sistema abrangente para controlar anomalias identificadas em um Laudo de Inspeção Predial, com funcionalidades-chave como diferenciação de segmentos específicos de um edifício, cadastro de prestadores de serviço, geração eficiente de ordens de serviço e criação de relatórios detalhados. Esse sistema é crucial para melhorar a gestão e eficácia na correção de anomalias, promovendo a preservação do patrimônio e tomada de decisões informadas.

---

### Principais tecnologias

- Java
- Spring Boot
- Javascript
- Oracle Cloud
- HTML
- Vue.js
- Axios
- CSS

#### Oracle Cloud
Plataforma de nuvem da Oracle para hospedagem e gerenciamento eficiente de aplicativos, oferecendo serviços abrangentes, como armazenamento escalável e soluções de banco de dados gerenciadas. Ideal para ambientes computacionais flexíveis, abrangendo desde nuvem pública até opções privadas e híbridas.

#### Vue.js
Framework JavaScript progressivo para construir interfaces de usuário em aplicações web. Destaca-se por sua simplicidade e flexibilidade, facilitando a criação de componentes reutilizáveis. Com um núcleo focado na visualização, Vue.js é uma escolha popular para o desenvolvimento ágil e escalável de interfaces interativas.

#### Axios
Biblioteca JavaScript para fazer requisições HTTP em aplicações web, simplificando a comunicação entre frontend e backend. Com suporte a cancelamento de requisições e tratamento de erros, o Axios oferece uma API intuitiva para solicitações assíncronas, contribuindo para um código mais robusto e eficiente.

---

### Contribuições pessoais
Segui com minha atuação no desenvolvimento, dessa vez me desafiando a atuar nas duas primeiras sprints apenas com tarefas de front-end, tendo assim adquirido conhecimentos nas tecnologias Vue.js e Axios. Além disso, também repeti o contato com estilização de páginas, reforçando conceitos de HTML e CSS. Esse semestre também foi crucial para consolidação do aprendizado de Spring Boot adicionando utilização do JPA (Java Persistence API).

<details>
<summary>Tela de cadastro de departamento e itens de checklist</summary>
<p>Tendo sido meu primeiro contato com Vue.js, fiz a ligação das minhas funções com as rotas de requisição do back-end pelo axios e implementei as variáveis reativas para carregamento e visualização dos dados na tela. Fui responsável por todas as funcionalidades dela, sendo envio de dados para cadastro de um departamento em uma rota e de checklist em outra, por meio de um callback, bem como edição e exclusão das informações inseridas nos campos das variáveis reativas.</p>
 
Trecho do código:

```
<div class="form-body">
      <div class="input-group">
        <div class="input-box">
          <label for="id_nome">Nome do segmento</label>
          <input
            type="text"
            class="input-nome-categoria"
            id="id_nome"
            v-model="nomeCategoria"
            placeholder="Ex.: Elétrica"
          />
        </div>
        <div class="input-box">
          <label for="id_checklist">Item do checklist</label>
          <input
            type="text"
            v-model="item"
            class="input-itens"
            id="id_checklist"
            placeholder="Ex.: Pontos de energia"
            @keydown.enter="inserirItem"
          />
        </div>
        <div class="botao=inserir">
          <button id="butCad" class="botao-inserir" @click="inserirItem">Inserir</button>
        </div>
      </div>

      <div class="section-itens">
        <div class="section-title-itens">
          <h1>Itens cadastrados</h1>
        </div>
          <div class="itens" v-for="(itemCadastrado, index) in itens" :key="index">
            <div class="column">{{ index + 1 }}: {{ itemCadastrado }}</div>
            <input v-if="estadoEdicao === index" v-model="itens[index]" @blur="salvarEdicao(index)" @keydown.enter="salvarEdicao(index)" />
              <svg xmlns="http://www.w3.org/2000/svg" id="btn-salvarEdicao" width="20" height="20" fill="currentColor" class="bi bi-check2-square" viewBox="0 0 16 16" @click="salvarEdicao(index)" v-if="estadoEdicao === index" style="margin-right: 10px;">
```

</details>


<details>
<summary>Tela de consulta de departamento</summary>
<p>O maior desafio dessa tela foi conseguir recuperar dados do back-end para display em um modal, que é aberto conforme interação do usuário. Esses dados além de serem visíveis, também são editáveis no mesmo campo, graças a funcionalidade do atributo Props do Vue.js.</p>

Trecho do código:

```
const nomeSegmento = ref('');
const idSegmento = ref('');
const checklistList = ref([]);
const checklistNome = ref('');
const checklistId = ref('');
const token = localStorage.getItem('token')

async function segmentoCaptura(id) {
    idSegmento.value = id.toString();
    try {
        const response = await axios.get('http://localhost:8080/segmento/' + idSegmento.value,{
            headers: {
                'Authorization': `Bearer ${token}` 
            }
        });
        const segmentoData = response.data;
        console.log(segmentoData);
        /*passe os valores do response para as ref*/
        idSegmento.value = segmentoData.id.toString();
        nomeSegmento.value = segmentoData.nome;
        checklistNome.value = segmentoData.checklistList.checklistNome;
        checklistId.value = segmentoData.checklistList.checklistId;
        checklistList.value = segmentoData.checklistList;

    } catch (error) {
        console.error('Ocorreu um erro ao coletar do segmento:', error);
    }
};
```
 
 
</details>

<details>
<summary>Mapeamento de entidades JPA e implementação de CRUD</summary>
Aqui voltei minha atenção ao back-end para conclusão do mapeamento das duas últimas entidades da aplicação. Além do mapeamento também fiz o relacionamento dessas entidades com outra classes, além de garantir a funcionalidade completa das operações CRUD.

Trecho do código:

```
@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "acesso")
    @Enumerated(EnumType.STRING)
    private UserRole role;


    @OneToOne(mappedBy = "usuario", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JsonIgnore
    private PrestadorServico prestadorServico;

    public Usuario(Long usuarioId, String email, String senha, UserRole role, PrestadorServico prestadorServico) {
        this.usuarioId = usuarioId;
        this.email = email;
        this.senha = senha;
        this.role = role;
        this.prestadorServico = prestadorServico;
    }
```


</details>

### Aprendizados Efetivos HS
Meu principal aprendizado foi a parte de front-end, pela primeira experiência com foco total nessa etapa e também pela abordagem da tecnologia Vue.js feita na disciplina de Laboratório de Desenvolvimento de Banco de Dados IV. Porém, foi muito valioso revisitar meus conhecimentos de back-end no final do projeto, tendo sido uma ótima maneira de fixar e consolidar os conhecimentos do Spring Boot e aprender sobre JPA. Gostaria de destacar como aprendizados:

- Consolidação de conhecimentos do Spring Boot;
- Consolidação de conhecimentos do JPA;
- Consolidação de conhecimento em front-end (Vue.js e Axios);
- Mais prática em estilização front-end (HTML e CSS).

