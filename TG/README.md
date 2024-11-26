# Ludmila Mariana Chagas

## Introdução

<p align="center">Olá, seja bem-vindo! </p>

Meu nome é Ludmila Mariana Chagas e sou estudante do tecnólogo de Banco de Dados na Fatec Profº Jessen Vidal, em São José dos Campos.

<p align="center"><img src="https://github.com/user-attachments/assets/b81508ba-eb50-4cb5-98d6-336e7b40d582" alt="Imagem do WhatsApp" width="300"></p>


## Principais conhecimentos

Tive meu primeiro contato com programação em um curso de técnico, sendo minha linguagem ingressante C++. Lá aprendi o básico de lógica de programação, porém foi na Fatec que desenvolvi com profundidade meus conhecimentos em Programação Orientada a Objetos e principalmente em Java, sendo hoje minha principal linguagem utilizada. Meu foco está no desenvolvimento backend, com implementações de webservices especialmente pelo framework Springboot.

# Índice
 
<details>
<summary>Projeto 1: 1º semestre 2021</summary>

- [Início Projeto 1](#projeto-1-1º-semestre-2021)
- [Visão do Projeto](#visão-do-projeto)
- [Principais tecnologias](#principais-tecnologias)
- [Contribuições pessoais](#contribuições-pessoais)
- [Aprendizados Efetivos Hard Skills](#aprendizados-efetivos-em-hard-skills)
- [Aprendizados Efetivos Soft Skills](#aprendizados-efetivos-em-soft-skills)
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

<details>
<summary>Projeto 5: 6º semestre 2021</summary>

- [Início Projeto 2](#projeto-5-1º-semestre-2021)
- [Visão do Projeto](#visão-do-projeto-1)
- [Principais tecnologias](#principais-tecnologias-1)
- [Contribuições pessoais](#contribuições-pessoais-1)
- [Aprendizados Efetivos HS](#aprendizados-efetivos-hs-1)
</details>

<details>
<summary>Projeto 6: 5º semestre 2021</summary>

- [Início Projeto 2](#projeto-5-1º-semestre-2021)
- [Visão do Projeto](#visão-do-projeto-1)
- [Principais tecnologias](#principais-tecnologias-1)
- [Contribuições pessoais](#contribuições-pessoais-1)
- [Aprendizados Efetivos HS](#aprendizados-efetivos-hs-1)
</details>

---

# [Projeto 1: 1º semestre 2021](https://github.com/silvercod3/Athena)

#### 1º Semestre do Curso | Parceiro Acadêmico: Professor Fabiano Sabha

---

### Visão do Projeto

O propósito do projeto foi trazer para os estudantes em geral uma forma mais centralizada e organizada de cuidar da vida acadêmica e se manter atualizado em suas atividades através de uma assistente pessoal de estudos, a Athena, tendo como diferencial é reunir diversas ferramentas úteis em um único lugar. Seu funcionamento é exclusivamente via comandos de voz.

---

### Principais tecnologias

- Python (back-end)
- SQLite (banco de dados)
- SpeechRecognition (back-end)
- PyAudio (back-end)

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

<details>
<summary>Conexão com banco de dados SQLite</summary>
<p>Utilizando o módulo <b>sqlite3</b> estabeleci uma conexão com um banco de dados SQLite. O código define uma função para criar essa conexão e lida com possíveis erros. Após estabelecida a conexão, uma função é definida para inserir registros no banco de dados, criando um cursor para executaros comandos SQL fornecidos e confirmando as mudanças com o comando *conexão.commit()*. </p>

Trecho do código:

```
import sqlite3
from sqlite3 import Error
def conexaobanco():
    caminho ="C:\\Users\\Famil\\OneDrive\\Área de Trabalho\\Fatec - 1 semestre\\banquinho\\Banco_Athena.db"
    con = None
    try:
        con = sqlite3.connect(caminho)
    except Error as ex:
        print(ex)
    return con

vcon = conexaobanco()
def inserir(conexao,sql):                 
    try:
        c = conexao.cursor()
        c.execute(sql)
        conexao.commit()  
        print('registro inserido')
    except Error as ex:
        print(ex)
```
</details>

<details>
<summary>População do banco de dados com dicas de estudos</summary>
<p>Através de pesquisas fiz uma base de dados com dicas de estudo para popular o banco de dados da nossa assistente, com a utilização do já citado módulo sqlite3 para interagir com um banco de dados SQLite. O código se conecta ao banco de dados dicas_athena.db, cria um cursor para executar comandos SQL e contém comandos para criar uma tabela chamada "dicas" e inserir várias dicas de estudo nessa tabela. No final, o comando banco.commit() é usado para confirmar as alterações no banco de dados. Essas dicas posteriormente serviram para consulta pelo usuário da aplicação.</p>

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
# [Projeto 2: 2º semestre 2021](https://github.com/PhatomFatec/PI_Necto_Systems)

#### 2º Semestre do Curso | Parceiro Acadêmico: Necto Systems

### Visão do Projeto

Desenvolver uma solução para monitoramento de um ou mais SGBDs (Sistema Gerenciador de Banco de Dados) remotos, bem como na coleta de métricas de funcionamento dos Banco de Dados presentes nos servidores da empresa, sendo essa solução um software integrado que monitora e apresenta métricas referentes ao uso e a saúde do SGBD em tempo real.

---

### Principais tecnologias

- Java (banck-end)
- PostgreSQL (banco de dados)

#### Java

Linguagem de programação de alto nível conhecida por sua robustez e portabilidade. Com uma sintaxe intuitiva e orientação a objetos, é uma escolha popular para desenvolvimento de software escalável, aplicações empresariais e sistemas embarcados.

#### PostgreSQL

Banco de dados relacional altamente confiável e flexível, que conta com recursos avançados e suporte para consultas complexas. Sua comunidade ativa e atualizações regulares garantem sua eficiência e segurança. Uma escolha confiável para armazenar e gerenciar dados com excelência.

---

### Contribuições pessoais
Novamente atuando como desenvolvedora, por esse projeto tive meu primeiro contato com conexão com banco de dados relacional, e foi nele que aprendi como configurar essa conexão e também consultas úteis para se fazer, bem como criar funções em Java e utilizar programação orientada a objetos.

<details>
<summary>Conexão com banco de dados PostgreSQL</summary>
<p>Utilizando o módulo <b>org.postgresql.Driver</b>, estabeleci uma conexão com um banco de dados PostgreSQL, lidando pela primeira vez com a utilização de um banco robusto na aplicação. O código define uma classe que gerencia a conexão, permitindo que o usuário forneça a URL do banco, nome de usuário e senha. A conexão é criada no construtor da classe e lida com possíveis erros de conexão. Além disso, um método é definido para fechar a conexão de forma segura quando não for mais necessária, garantindo a liberação dos recursos utilizados.</p>
 
Trecho do código:

	public class conexao {

	private Connection con;

	static Scanner sc = new Scanner(System.in);

	private static String url = sc.next();
   	private static String user = sc.next();
    	private static String pass = sc.next();

	public conexao(String databaseName) {

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url + databaseName, user, pass);
		} catch (Exception e) {
			throw new Error("Houve um problema ao conectar no banco de dados!");
		}
	}

	private void closeConnection() {
		try {
			if (!this.con.isClosed()) {
				this.con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

</details>

<details>
<summary>Consulta de queries mais rápidas e mais lentas do banco de dados</summary>
<p>No código, foram criados dois métodos em Java para recuperar consultas com base em tempos de execução. O método gettopQuickQuery() retorna as consultas com menor tempo de execução lendo o número de consultas de um arquivo queries.txt, enquanto getTopSlowestQueries() retorna as consultas com maior tempo de execução. Ambos os métodos usam um HashMap para armazenar os resultados e lidam com erros durante a execução das consultas SQL. Esses métodos visam monitorar e otimizar o desempenho do banco de dados.</p>
 
Trecho do código:

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

</details>

<details>
<summary>Consulta de status de conexões no banco de dados</summary>
<p>Defini um método para consultar o status das conexões no banco de dados PostgreSQL. O código executa uma consulta SQL que busca o nome do banco de dados (datname) e o estado (state) das conexões ativas na tabela pg_stat_activity. Essas informações são armazenadas em um HashMap (uma estrutura que armazena dados em pares de chave e valor) para fácil acesso. Se ocorrer algum problema durante a consulta, uma mensagem de erro é exibida, juntamente com detalhes técnicos para ajudar na resolução do problema.</p>
 
Trecho do código:


	private HashMap<String, String> getQueryConnection() {
			HashMap<String, String> response = new HashMap<>();

		try {
			String sql = "SELECT datname, state from pg_stat_activity WHERE datname is not null;";

			PreparedStatement pesquisa = con.prepareStatement(sql);

			ResultSet result = pesquisa.executeQuery();

			while(result.next()) {
				response.put(result.getString("datname"), result.getString("state"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Houve um problema ao requisitar status geral do backend");
		}

		return response;
	}


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

# [Projeto 3: 1º semestre 2023](https://github.com/Thunder53/Dom-Rock/tree/main)

#### 3º Semestre do Curso | Parceiro Acadêmico: Dom Rock

### Visão do Projeto
A Dom Rock recebe a predição de vendas de seus clientes em formato csv tendo que padronizar todos os arquivos antes do uso, sendo assim sentiu necessidade de uma aplicação web que facilitaria a entrada destes dados em um padrão definido diminuindo o tempo gasto com a padronização. 
A solução proposta consiste em lidar com o histórico de movimentação de produtos (vendas e estoque), predição de faturamento (feito por um algoritmo de IA já existente) e a entrada de dados oriundas da força de vendas quanto ao planejamento futuro.

---

### Principais tecnologias

- Java (back-end)
- Spring Boot (back-end)
- PostgreSQL (banco de dados)
- HTML (front-end)
- CSS (front-end)
- Javascript (front-end)

#### Spring Boot
Framework de desenvolvimento de aplicativos Java que fornece um ambiente robusto para a criação de aplicativos empresariais escaláveis e de alta qualidade. Com recursos como injeção de dependência e controle transacional, o Spring facilita o desenvolvimento, a manutenção e a integração de sistemas complexos, permitindo que os desenvolvedores se concentrem na lógica de negócios. Além disso, o Spring Boot simplifica a criação de arquiteturas de servidor REST, oferecendo uma configuração mínima e um conjunto de ferramentas poderosas para desenvolver APIs RESTful rapidamente, garantindo uma integração eficiente e uma escalabilidade sólida.

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

# [Projeto 4: 2º semestre 2023](https://github.com/B1nary-Devs/JAIA-SOFTWARE)

#### 4º Semestre do Curso | Parceiro Acadêmico: Jaia Software

### Visão do Projeto
O desafio consiste em desenvolver um sistema abrangente para controlar anomalias identificadas em um Laudo de Inspeção Predial, com funcionalidades-chave como diferenciação de segmentos específicos de um edifício, cadastro de prestadores de serviço, geração eficiente de ordens de serviço e criação de relatórios detalhados. Esse sistema é crucial para melhorar a gestão e eficácia na correção de anomalias, promovendo a preservação do patrimônio e tomada de decisões informadas.

---

### Principais tecnologias

- Java (back-end)
- Spring Boot (back-end)
- Oracle Cloud (banco de dados)
- Javascript (front-end)
- HTML (front-end)
- Vue.js (front-end)
- Axios (front-end)
- CSS (front-end)

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

-----
-----

# [Projeto 5: 1º semestre 2024](https://github.com/GroupHextech/HEXTECH-API6sem)

#### 6º Semestre do Curso | Parceiro Acadêmico: Imagem

---

### Visão do Projeto

Esse projeto tem como visão desenvolver uma plataforma inovadora que utiliza inteligência artificial para analisar comentários online pelo sentimento expressado, classificando-os como positivos, neutros ou negativos. Essa análise será integrada a um dashboard junto com outras informações sobre esses clientes que comentaram, permitindo extrair insights valiosos para orientar a tomada de decisões estratégicas com base na satisfação do cliente.

---

### Principais tecnologias

- React (front-end)
- Python (back-end)
- Flask (back-end)
- Jupyter Notebook (machine learning)
- XGBoost (machine learning)
- Mongo DB (banco de dados)
- Firebase (banco de dados)
  

#### React
Biblioteca JavaScript amplamente utilizada para a criação de interfaces de usuário interativas e dinâmicas. Com sua abordagem baseada em componentes reutilizáveis, React permite o desenvolvimento de interfaces complexas de forma eficiente e organizada. Sua popularidade se deve à sua capacidade de criar interfaces responsivas e de alto desempenho.

#### Flask
Flask é um framework web leve e flexível para Python, adequado para o desenvolvimento de pequenas a grandes aplicações web. Sua simplicidade de uso e sua extensibilidade fazem do Flask uma escolha popular entre os desenvolvedores que buscam uma solução rápida e eficiente para a construção de APIs e aplicações web.

#### Jupyter Notebook
Aplicação web que permite criar e compartilhar documentos interativos que contenham código, visualizações e texto explicativo. Amplamente utilizado na área de machine learning, o Jupyter Notebook facilita a exploração de dados, o desenvolvimento de modelos e a comunicação dos resultados, tornando o processo de desenvolvimento mais ágil e colaborativo.

#### XGBoost
Biblioteca otimizada de machine learning que oferece implementações eficientes de algoritmos de boosting de árvore. Conhecido por sua rapidez e desempenho superior, o XGBoost é amplamente utilizado em competições de machine learning e em aplicações onde a precisão e a velocidade são essenciais.

#### MongoDB
Banco de dados NoSQL (não relacional) orientado a documentos, projetado para armazenar, recuperar e gerenciar informações de forma flexível e escalável. Sua estrutura de dados baseada em documentos JSON permite uma integração fácil com aplicações web e uma modelagem de dados mais dinâmica em comparação com bancos de dados relacionais tradicionais.

#### Firebase
Plataforma de desenvolvimento de aplicativos móveis e web que oferece uma variedade de serviços, incluindo um banco de dados em tempo real. Com o Firebase, os desenvolvedores podem criar aplicativos escaláveis e de alta qualidade, com recursos como autenticação de usuários, análise de dados e hospedagem de arquivos.

---

### Contribuições pessoais

Tendo maior experiência em inteligência artificial por já ter tido uma experiência profissional nesta área, tive como foco de atuação as tarefas relacionadas ao <i>Machine Learning</i> (aprendizado de máquina), que é o trabalho de ensinar o computador a aprender com os dados para executar alguma ação, no nosso caso, analisar os sentimento dos comentários.
Com atuação quero dizer que participei de diversas etapas nessa parte do nosso desafio, como a escolha da base de dados, o estudo e escolha dos algoritmos para treinar o modelo, o treinamento do modelo e melhorias na performance dele.

Dentre meu trabalho realizado, posso destacar:

<details>
<summary>Estudo, implementação e treinamento do primeiro modelo: algoritmo Naive Bayes</summary>
<p>Implementei nosso primeiro modelo com o algoritmo Naive Bayes, que encontrei através de pesquisas, conhecido por ser simplificado e otimizado, fornecendo um treinamento super rápido e com resultados satisfatórios. Devido sua leveza e simplicidade, foi uma ótima escolha para nossa entrega da primeira sprint.</p>

Trecho do código:

```
# Carrega o conjunto de dados
dataset = pd.read_csv("C:\\fatec\\B2W-Reviews01\\B2W-Reviews01.csv")

# Mostra o tamanho do dataset original
print("Tamanho do dataset original:", dataset.shape[0], "\n")

# Remove linhas com valores em branco
dataset = dataset.dropna(subset=['review_text', 'overall_rating'])

# Mostra o tamanho do dataset alterado
print("Tamanho do dataset alterado:", dataset.shape[0], "\n")

# Cria uma nova coluna para classificar entre comentários positivos, negativos ou neutros com base na nota:
dataset['feeling'] = np.where(dataset['overall_rating'] < 3, 'Negative', np.where(dataset['overall_rating'] == 3, 'Neutral', 'Positive'))

# Mostra os primeiros registros do dataset
print("Primeiros registros do dataset:")
print(tabulate(dataset.head(20), headers='keys', tablefmt='pipe'))

# Separar os dados em features (X) e target (Y)
X = dataset['review_text'].values
Y = dataset['feeling'].values

# Criar um objeto CountVectorizer com N-grams
ngram_vectorizer = CountVectorizer(ngram_range=(1, 3))  # Considera unigramas, bigramas e trigramas

# Vetorizar os dados de texto com N-grams
X_ngrams = ngram_vectorizer.fit_transform(X)

# Dividir os dados em conjunto de treinamento e teste
X_train, X_test, Y_train, Y_test = train_test_split(X_ngrams, Y, test_size=0.2, random_state=42)

# Criar e treinar o modelo Naive Bayes com os dados vetorizados com N-grams
model_ngrams = MultinomialNB()
model_ngrams.fit(X_train, Y_train)

# Avaliar o modelo com N-grams
accuracy_ngrams = model_ngrams.score(X_test, Y_test)
print("Acurácia:", accuracy_ngrams)

# Prever as classes para os dados de teste
Y_pred = model_ngrams.predict(X_test)

# Criar um DataFrame com as previsões e as verdadeiras classes de "feeling"
df_results = pd.DataFrame({'Feeling_Predicted': Y_pred, 'Feeling_True': Y_test})

# Mostrar os resultados
print("\nResultados de 'feeling' após o treinamento do modelo:")
print(df_results.head(20))  # Exibir os 20 primeiros registros

# Salvar o modelo e o vetorizador em um único arquivo, no mesmo diretório deste notebook
dump((model_ngrams, ngram_vectorizer), 'modelo_naive_bayes.joblib')

```

</details>

<details>
<summary>Melhoria na performance através do balanceamento de classes (Data Augmentation)</summary>
<p>Em busca de obter melhoria nos resultados, foi realizado o balanceamento de classes (que é importante para o modelo aprender a classificar corretamente todas as classes) com a técnica chamada de Data Augmentation, aumentando a quantidade de dados de treinamento disponíveis, criando novas amostras a partir das existentes, para a classe com menor representação. Isso foi feito com a biblioteca nlpaug, em específico, o método SynonymAug, para realizar a substituição de palavras por sinônimos, com o objetivo de gerar variações nos comentários neutros.</p>

Trecho do código:

```
# Filtra os comentários neutros
neutral_comments = dataset.loc[dataset['feeling'] == 1]

# Aumenta os dados (comentários da classe 'Neutro')
synonym_aug = naw.SynonymAug(aug_src='wordnet')
augmented_comments = []

for comment in neutral_comments['review_text']:
    for _ in range(3):  # Gera 3 variações para cada comentário neutro
        augmented_comment = synonym_aug.augment(comment)
        new_row = {'review_text': augmented_comment, 'overall_rating': 3, 'feeling': 1}
        augmented_comments.append(new_row)

# Adiciona os comentários aumentados ao dataset combinado
augmented_comments_df = pd.DataFrame(augmented_comments)
dataset = pd.concat([dataset, augmented_comments_df], ignore_index=True)
```
</details>

<details>
<summary>Ajustes de peso da classe Neutro</summary>
<p>Para melhorar a capacidade do modelo em lidar com categorias desbalanceadas, foi realizado o ajuste dos pesos das classes durante o treinamento. Essa técnica foi aplicada para garantir que a classe "neutro", com menos exemplos disponíveis, tivesse uma influência proporcionalmente maior no aprendizado. Os pesos foram calculados considerando o número de amostras em cada classe, assegurando que as categorias menos representadas recebessem maior atenção do modelo. Assim, foi possível alcançar um treinamento mais equilibrado e representativo.</p>

Trecho do código:

```
# Calcula os pesos de amostra com base nas classes
class_weights = np.zeros(len(Y_train))
class_counts = np.bincount(Y_train)
for i in range(len(class_counts)):
    class_weights[Y_train == i] = len(Y_train) / class_counts[i]

# Treina o modelo XGBoost com pesos de amostra
xgboost.fit(X_train, Y_train, sample_weight=class_weights)

```

</details>
 
### Aprendizados Efetivos em Hard Skills
Durante esse projeto, aprofundei meus conhecimentos em machine learning e manipulação de dados. A implementação e treinamento de modelos, como Naive Bayes e XGBoost, permitiram consolidar práticas como vetorização de texto, balanceamento de classes e técnicas de data augmentation. Além disso, reforcei minha experiência em Python e explorei ferramentas como a biblioteca nlpaug para enriquecer a base de dados, aprimorando a capacidade do modelo de lidar com desbalanceamento. Foi uma oportunidade significativa para consolidar conceitos de inteligência artificial e desenvolver soluções práticas com impacto direto na qualidade dos resultados. Alguns dos destaques foram:

* Machine Learning;
* Manipulação de Dados;
* Data Augmentation;
* Consolidação de conhecimentos em Python.

-----
-----

# [Projeto 6: 2º semestre 2024](https://github.com/projetoKhali/api5)

#### 5º Semestre do Curso | Parceiro Acadêmico: Pro4tech

---

### Visão do Projeto



---

### Principais tecnologias

- React Native (front-end)
- Go (back-end)
- Python (back-end)
  

#### React


---

### Contribuições pessoais

a

Dentre meu trabalho realizado, posso destacar:

<details>
<summary>AA</summary>
<p>A</p>

Trecho do código:

```

```

</details>

<details>
<summary>A</summary>
<p>A</p>

Trecho do código:

```

```
</details>

<details>
<summary>A</summary>
<p></p>

Trecho do código:

```


```

</details>
 
 ### Aprendizados Efetivos em Hard Skills


### Aprendizados Efetivos em Soft Skills


