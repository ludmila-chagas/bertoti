## O INSTITUTO QUE GERENCIAS ESCOLAS

A Aplicação funciona da seguinte forma:

- Temos o instituto que Gerenciador (Controller) que implementa o Secretaria(Observer) e inicializa o SistemaDeCadastros(Model) e a interface de Prompt(View)

- A Escola será uma instância única.

O Gerenciador:
    - Para cara escola gerenciada pelo Gerenciador, teremos que emitir um aviso de inicio de matricula.(Observer)

O Aluno(Cliente):
    - O aluno tem 2 campos: ID, Nome.

A Escola(Singleton): implementa Observer
    - A escola contém alunos cadastrados.


- A Escolas vão repassar o aviso para os alunos matriculados que chegou a hora de fazer rematricula. (Observer)
- Cada aluno que se rematricular receberá novamente o próximo aviso quando chegar a hora.

O SistemaDeCadastro(Model):
    - Matricula e rematricula: (Facade) -> Chama um método de matrícula ou rematricula, utilizando o Controler que acessa a Escola e realiza a estratégia selecionada (Strategy)

MVC - Model(SistemaDeCadastro), View(PromtDeCadastro), Controller(Gerenciador)
Facade - Método de rematricula que chama o controler que entra em contato com a Escola(Encapsular o método rematricula)
