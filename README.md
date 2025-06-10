# Engenharia de Software III 😏
Disciplina ministrada pelo professor Claudio Souza Nunes


Lattes:  http://lattes.cnpq.br/7682775885207598

## Aula 01
### Gestão de Código Fonte (Source Code Management - SCM)

#### Gestão de Código Fonte (SCM)
A gestão de código fonte é um processo que envolve gerenciar todas as alterações feitas em um software, desde sua criação até sua implementação. Isso é feito através da utilização de um sistema de controle de versão, que permite armazenar, rastrear e gerenciar o código fonte de um projeto.

#### SCM - Estratégias
- **Controle de versão centralizado**: Envolve o uso de um repositório centralizado onde todos os desenvolvedores compartilham o código fonte e fazem alterações diretamente no repositório central.
- **Controle de versão distribuído**: Envolve o uso de vários repositórios, onde cada desenvolvedor possui uma cópia do código fonte e faz alterações localmente. As alterações são então sincronizadas com os outros repositórios quando necessário.

#### Git
O Git é um sistema de controle de versão de software, criado por Linus Torvalds em 2005. Ele foi inicialmente projetado para gerenciar o código fonte do kernel Linux, mas desde então se tornou uma das ferramentas mais populares para gerenciamento de versões em projetos de desenvolvimento de software em geral.

#### Git Colaboração
- **Colaboração em equipes**: Quando várias pessoas estão trabalhando em um projeto de software, é importante que todos possam colaborar facilmente e manter o código em sincronia. O Git facilita esse processo, permitindo que várias pessoas trabalhem em diferentes partes do código ao mesmo tempo.

#### Git - Controle de Versão
- **Controle de versões**: O Git ajuda a controlar as diferentes versões do código, permitindo que os desenvolvedores possam rastrear as alterações realizadas ao longo do tempo e desfazer mudanças indesejadas.

#### Git - Trabalho Offline
- **Trabalho offline**: Com o Git, é possível trabalhar em projetos de software mesmo quando não se está conectado à internet. Os desenvolvedores podem trabalhar em um repositório local, fazer as alterações necessárias e depois sincronizar com o repositório remoto quando estiverem online.

#### Git - Controle de Ramificações (Branches)
- **Ramificação de código**: O Git permite criar ramificações de código, permitindo que os desenvolvedores trabalhem em diferentes recursos do projeto sem interferir no trabalho dos outros. Isso é particularmente útil quando se está desenvolvendo recursos complexos ou testando novas funcionalidades.

#### Git - Hospedagem
- **Hospedagem de código**: O Git é usado em muitas plataformas de hospedagem de código, como o GitHub, GitLab e Bitbucket. Essas plataformas permitem que desenvolvedores compartilhem e colaborem em projetos de software de forma mais fácil e organizada.

#### GitHub
O GitHub é uma plataforma de hospedagem de código fonte para projetos de software, criada em 2008 por Tom Preston-Werner, Chris Wanstrath e PJ Hyett. A plataforma foi originalmente criada para hospedar projetos de código aberto baseados no Git. Em 2018, o GitHub foi adquirido pela Microsoft por US$ 7,5 bilhões.

- **Recursos do GitHub**: Além de hospedar projetos de software, o GitHub também oferece uma série de ferramentas e recursos para desenvolvedores, incluindo controle de versão, gerenciamento de problemas, revisão de código, integração contínua e muito mais. A plataforma é gratuita para projetos de código aberto e oferece planos pagos para empresas e organizações que desejam hospedar projetos privados.

## Aula 02
### Integração Contínua (CI) e Entrega Contínua (CD)

#### Conceitos de Integração Contínua (CI) e Entrega Contínua (CD)
- **CI**: Integração frequente de código em um repositório compartilhado, com automação de builds e testes.
- **CD**: Extensão da CI, preparando automaticamente o código para deployment em produção.
- **Objetivo**: Garantir que o software esteja sempre em um estado que possa ser entregue aos usuários finais com segurança.

#### Integração Contínua (CI)
- Desenvolvedores integram código em um repositório compartilhado várias vezes ao dia.
- Cada integração aciona uma build automatizada e testes para verificar a qualidade do código.
- **Exemplo**: Em um projeto com 5 desenvolvedores, cada um realiza commits 3 vezes ao dia. A integração contínua evita que problemas se acumulem, detectando-os logo após o commit.

#### Objetivos da CI
- **Detecção precoce de erros**: Identifica problemas logo após cada commit, facilitando a correção imediata.
- **Automação de builds e testes**: Reduz a carga manual, aumentando a eficiência e consistência.
- **Redução de conflitos de merge**: Conflitos são menores e mais fáceis de resolver quando as integrações são frequentes.

#### Ferramentas Comuns de CI
- **Jenkins**: Automação extensível para CI/CD com suporte a pipelines complexos.
- **GitLab CI/CD**: Integração nativa com repositórios GitLab, facilitando CI/CD.
- **AWS CodePipeline**: Serviço da AWS que permite automação de fluxos de trabalho de CI/CD.
- **Azure Pipelines**: Ferramenta da Microsoft para CI/CD, com integração ao Azure DevOps e suporte a diversas linguagens e plataformas.
- **Google Cloud Build**: Serviço da Google para construir, testar e implantar aplicações rapidamente na infraestrutura do Google Cloud.
- **CircleCI**: Automação de CI/CD com foco em integração contínua e entrega rápida.
- **Travis CI**: Serviço popular de CI para projetos open-source e privados.

#### Entrega Contínua (CD)
- CD automatiza a preparação do código para deployment, garantindo que ele esteja sempre pronto para produção.
- **Exemplo**: Após o sucesso na pipeline de CI, o código é automaticamente empacotado em um contêiner Docker e enviado para o ambiente de staging, pronto para o deploy final.
- *O Docker empacota o código em um contêiner com tudo o que ele precisa para rodar em qualquer ambiente. Depois, ele é enviado para o ambiente de staging, que funciona como um teste antes do lançamento. Se tudo estiver correto, o código segue para o deploy final, tornando-se acessível para os usuários.*

#### Objetivos da CD
- **Redução do tempo de entrega**: Ciclo mais curto entre o desenvolvimento e o lançamento de novas funcionalidades.
- **Automação do deploy**: Elimina tarefas manuais, reduzindo a probabilidade de erro.
- **Confiabilidade**: Automação contínua garante que o código esteja sempre em um estado pronto para ser liberado.

#### Ferramentas Comuns de CD
- **Docker**: Automatiza a criação e deploy de contêineres, garantindo consistência entre ambientes.
- **Kubernetes**: Orquestração de contêineres para gerenciar o deploy e escalabilidade em produção.
- **AWS CodeDeploy**: Serviço da AWS que automatiza o deploy de código em qualquer instância, incluindo Amazon EC2 e servidores locais.
- **Azure DevOps (Azure Release Pipelines)**: Ferramenta da Microsoft que permite automação de deploys em diversos ambientes com pipelines configuráveis.
- **Google Cloud Deploy**: Serviço da Google para orquestrar e automatizar o deploy contínuo de aplicações na infraestrutura do Google Cloud.
- **AWS CodePipeline**: Ferramenta de CI/CD na nuvem que integra com outros serviços AWS para entrega contínua.
- **GitLab CD**: Integração com GitLab CI, facilitando todo o ciclo de vida do desenvolvimento.

#### CI/CD e Estratégias de Branch no GIT
- **Branching** organiza o trabalho, permitindo que desenvolvedores colaborem sem interromper o fluxo de trabalho.
- Suporte a múltiplas versões e lançamentos simultâneos.
- **Exemplo**: Um projeto com múltiplas equipes pode gerenciar features, correções e lançamentos separadamente usando diferentes branches.

#### Branch Principal (Main/Master)
- **Descrição**: Branch principal representa a versão mais estável e pronta para produção do código. Protegido contra commits diretos, exigindo revisões e aprovação para merges.
- **Exemplo**: Equipe trabalha em branches secundários. Após aprovação, mudanças são integradas ao main, onde a pipeline de CI/CD executa automaticamente testes e deploys.

#### Feature Branching
- **Descrição**: Branches são criados para novas funcionalidades, mudanças ou correções específicas. Desenvolvimento acontece no branch isolado, permitindo testes e validações antes da integração.
- **Exemplo**: Um desenvolvedor cria o branch feature/login-api. Após completar o desenvolvimento e passar nos testes, ele abre um Pull Request para integrar ao main, acionando a pipeline de CI/CD.

#### Git Flow
- **Descrição**: Estratégia com múltiplos branches para desenvolvimento (develop), lançamentos (release) e correções urgentes (hotfix). Permite que grandes equipes trabalhem simultaneamente em funcionalidades, estabilização e correções.
- **Exemplo**:
  - **develop**: Branch principal para desenvolvimento.
  - **release/1.0.0**: Branch para preparação de uma nova versão.
  - **hotfix/1.0.1**: Correção urgente em uma versão já lançada.

#### Trunk-Based Development
- **Descrição**: Foco em commits frequentes diretamente no branch principal (trunk). Integração contínua e testes automatizados garantem que o código esteja sempre pronto para deploy.
- **Exemplo**: Equipe realiza commits pequenos e frequentes no main, integrando código novo rapidamente e resolvendo conflitos imediatamente.

#### Release Branching
- **Descrição**: Branches de lançamento são criados para estabilizar uma versão antes de sua liberação oficial. Apenas correções de bugs e ajustes são permitidos neste branch.
- **Exemplo**: release/v2.0: Criado quando a versão 2.0 está pronta para ser estabilizada. Correções são feitas neste branch até o lançamento oficial.

## Aula 03
### Requisitos de software

- Definição: uma condição ou capacidade necessária para que o usuário resolva um problema ou atinja um objetivo.
  
#### Classificação dos Requisitos
##### Simples
- *Funcional*: expressam o que os sistema deve fazer, sem ele o sistema não tem propósito ou não funciona.
- *Não funcional*: expressam como o sistema deve se comportar, condições para o seu funcionamento ideal.

##### Detalhada (exemplos) 
- **Requisitos de Design**: o sistema deve utilizar um padrão de arquitetura de software de três camadas para separar as responsabilidades de apresentação, lógica de negócio e acesso a dados.
- **Requisitos Funcionais**: o sistema deve permitir que os usuários façam login usando suas credenciais de email e senha e, em caso de sucesso, rediredioná-los para a página principal.
- **Requisitos de Implementação**: o código deve ser desenvolvido em Java versão 11 e seguir as diretrizes de codificação do Google Java Style Guide.
- **Requisitos de Interface**: o sistema deve ter uma interface gráfica baseada em web, acessível via navegadores compatíveis com HTML5 e CSS3, e deve ser responsiva em dispositivos móveis.
- **Requisitos de Desempenho**: o sistema deve ser capaz de processar 1000 transações por segundo, com um tempo de resposta máximo de 2 segundos para cada transação.
- **Requisitos Físicos**: o servidor que hospeda o sistema deve ter pelo menos 16 GB de RAM, 4 CPUs de 2.4 GHz, e 500 GB de espaço em disco SSD.

#### Fonte de Requisitos
- **Entrevistas Individuais**: conversas diretas como stakeholders para identificar necessidades, expectativas e problemas.
- **Workshops de Grupos (JAD ou Similar)**: sessões facilitadas onde grupos de stakeholders se reúnem para discutir e definir requisitos colaborativamente.
- **Estudo dos Documentos**: análise de documentação existente como manuais de processos, requisitos antigos, políticas organizacionais, etc.
- **Análise de Estatísticas**: utilização de dados estatísticos históricos para identificar padrões e requisitos baseados em tendências observadas.
- **Técnicas de Amostragem**: coleta de dados de uma amostra representativa para inferir requisitos de todo o sistema.
- **Observação In Loco dos Processos**: observação direta dos processos de negócio no ambiente de trabalho para identificar necessidades e problemas.
- **Questionários**: questionários estruturados enviados para stakeholders para coletar informações e opiniões sobre o sistema.
- **Exame dos Registros Existentes**: revisão de registros logs e relatórios do sistema atual para identificar áreas problemáticas e necessidades não atendidas.
- **Design Thinking**: abordagem centrada no usuário que envolve empatia, definição de problemas, ideação, prototipagem e texte para criar soluções inovadores.
- **Prototipagem**: desenvolvimento de protótipos do sistema ou partes dele para coletar feedback antecipada e refinar requisitos.
- **Estudo de Benchmarking**: comparação das práticas e funcionalidades do sistema em desenvolvimento com as de concorrentes ou padrão de mercado.
- **Análise de SWOT**: identificação das forças, fraquezas, oportunidades e ameaças associadas ao projeto para determinar os requisitos que maximizam as oportunidades e mitigam riscos.

#### Atributos dos Requisitos
- Correto
- Testável
- Completo
- Consistente
- Aceitável
- Não ambíguo
- Rastreável
- Priorizável
- Modificável

#### Requisitos durante o processo de software
Requisitos representam diferentes coisas para diferentes participantes do processo de desenvolvimento:
- **Usuários finais**: definem os requisitos e homologam o correto entendimento. Também iniciam os processos de mudança de requisito.
- **Gerentes de Desenvolvimento**: usam os requisitos para estimar e planejar as tarefas de desenvolvimento.
- **Desenvolvedores (implementação)**: usam os requisitos para entender o que deve ser realizado.
- **Equipe de Teste**: usam os requisitos para criar os testes de validação do sistema.
- **Desenvolvedores (manutenção)**: usam os requisitos para identicar as relações entre as partes que compõem os sistema.

#### Problemas com linguagem natural
- Ambiguidade
- Excesso de flexibilidade
- Falta de estrutura e modularidade
- Impossível de implementar
- Confusos ou misturados

#### Alguns erros comuns na definição de escopo
- Usar como base documentação não oficial
- Usar como base documentação desatualizada
- Não se certificar de quem é o ponto focal dos requisitos
- Não atenar para questões de naturexa jurídica
- Não cruzar requisitos entre as diversas fontes de informações
- Acreditar que alguns requisitos estão *implícitos*
- Não especificar requisitos inversos *(fora do escopo)*
- Não atentar para performance do sistema em produção
- Não considerar todas as plataformas de interface
- Não documentar adequadamente.

## Aula 04
### SCRUM e ALM: Transformando o Ciclo de Vida de Aplicações

#### Fundamentos do ALM (Application Lifecycle Management)
1. **Planejamento**: Define escopo, recursos e cronogramas essenciais para o projeto.
2. **Desenvolvimento**: Codificação e implementação das funcionalidades planejadas.
3. **Testes**: Verificação de qualidade e conformidade com os requisitos.
4. **Implantação**: Entrega do software ao ambiente de produção.

#### SCRUM no Contexto do ALM
- **Integração Estratégica**: SCRUM organiza as etapas do ALM de forma iterativa. Cada sprint aborda múltiplas fases do ciclo.
- **Complementaridade**: ALM fornece visibilidade do processo completo. SCRUM adiciona agilidade e adaptabilidade.
- **Benefícios**: Entregas mais rápidas. Maior flexibilidade. Melhor controle de qualidade em cada etapa.

#### Papéis Essenciais no SCRUM
- **Product Owner**: Define requisitos e prioridades. Representa o cliente. Maximiza o valor do produto.
- **Scrum Master**: Facilita processos. Remove impedimentos. Garante aplicação da metodologia.
- **Time de Desenvolvimento**: Executa atividades. Entrega incrementos do produto. Auto-organiza o trabalho.

#### Backlogs: O Coração do SCRUM
- **Product Backlog**: Lista priorizada de todas as funcionalidades desejadas. Gerenciado pelo Product Owner.
- **Refinamento**: Detalhamento e estimativa dos itens. Preparação para entrada em sprints futuras.
- **Sprint Backlog**: Itens selecionados para a sprint atual. Gerenciado pela equipe de desenvolvimento.
- **Incremento**: Produto funcional entregue ao final da sprint. Agrega valor ao negócio.

#### Exemplos Práticos de Product Backlog
1. **Login com Redes Sociais**: Implementar autenticação via Facebook, Google e LinkedIn para facilitar acesso.
2. **Painel Administrativo**: Criar interface para gerenciamento de usuários, permissões e configurações.
3. **Otimização de Performance**: Reduzir tempo de carregamento das páginas em 50%.
4. **Relatórios Analíticos**: Desenvolver dashboards personalizados para usuários premium.

#### Cerimônias SCRUM
- **Sprint Planning**: Definição do que será desenvolvido na sprint.
- **Sprint Retrospective**: Avaliação do processo para melhoria contínua.
- **Daily Scrum**: Reunião diária de 15 minutos para sincronização da equipe. 
- **Sprint Review**: Demonstração do incremento desenvolvido para stakeholders.

#### SCRUM vs. Cascata

| Critério         | SCRUM                          | Cascata                        |
|------------------|--------------------------------|--------------------------------|
| Entrega          | Iterativa e incremental        | Sequencial única no final      |
| Flexibilidade    | Alta, mudanças rápidas         | Baixa, mudanças custosas       |
| Comunicação      | Constante e colaborativa       | Documentada, formal            |
| Risco            | Menor, identificação precoce   | Maior, identificação tardia    |

- **Agile**: Flexível, iterativo.
- **Waterfall**: Rígido, metodologia de gerenciamento sequencial.

#### Benefícios Comprovados do SCRUM
- **Entrega de Valor Acelerada**: Funcionalidades prioritárias chegam mais rápido aos usuários finais.
- **Adaptabilidade**: Rápida resposta às mudanças de mercado e requisitos.
- **Qualidade Elevada**: Testes contínuos e feedback frequente melhoram o produto.
- **Redução de Riscos**: Problemas são identificados e resolvidos precocemente no processo.
  
## Aula 05

### Design Pattern

### Singleton
O **Singleton** é um padrão de projeto **criacional**, utilizado para garantir que uma classe tenha **apenas uma instância** ao longo de toda a execução da aplicação e que forneça um **ponto global de acesso** a essa instância.

#### Características principais

- Garante que **somente uma instância** de uma classe estará disponível em qualquer momento.
- Oferece um **ponto centralizado de acesso**, facilitando o controle e a manutenção.
- Possibilita o **acesso global** ao objeto instanciado, útil para funcionalidades como gerenciamento de configurações, logs ou conexões com banco de dados.
- Evita erros relacionados à criação de múltiplas instâncias desnecessárias.
- Possui **acesso mais rápido** à instância após a criação.

#### Lazy Initialization

O Singleton muitas vezes é implementado com o uso de **Lazy Initialization**, uma técnica em que o objeto **só é instanciado no momento em que for realmente necessário**. Isso otimiza o uso de recursos, principalmente quando a criação do objeto é custosa.

#### Exemplo em Java

```java
public class Singleton {
  private static Singleton instance;
  private String data;

  // Construtor privado impede instâncias externas
  private Singleton(String data) {
      this.data = data;
  }

  // Método de acesso à instância (lazy initialization)
  public static Singleton getInstance(String data) {
      if (instance == null) {
          instance = new Singleton(data);
      }
      return instance;
  }

  public String getData() {
      return data;
  }
}
```

##### Explicação do código:

- `private static Singleton instance;`  
  Armazena a **única instância** da classe.

- `private Singleton(String data);`  
  Construtor privado impede a criação de objetos fora da classe.

- `public static Singleton getInstance(String data);`  
  Cria a instância **somente se ainda não existir** e a retorna. Essa é a implementação do **Lazy Initialization**.

####  Quando usar?

- Quando é necessário garantir que **apenas uma instância** de uma classe seja usada.
- Quando se precisa de **acesso global** ao mesmo objeto.
- Exemplos comuns: **loggers**, **gerenciadores de configuração**, **conexões com banco de dados**.

## Aula 06

### Facade

- Objetivo
Fornecer uma interface única e simplificada para um conjunto de classes complexas.

- Motivação
Você tem várias classes que realizam tarefas específicas (ex: CPU, Disco, Memória), mas o usuário quer uma forma fácil de interagir com todas essas partes sem saber como elas funcionam.

**Estrutura**

- Classes do subsistema com lógicas específicas.
- Uma classe fachada que encapsula e coordena as chamadas ao subsistema.

```java
class CPU {
    void iniciar() { System.out.println("CPU iniciada"); }
}

class Memoria {
    void carregar() { System.out.println("Memória carregada"); }
}

class Disco {
    void ler() { System.out.println("Disco lendo dados"); }
}

public class ComputadorFacade {
    private CPU cpu;
    private Memoria memoria;
    private Disco disco;

    public ComputadorFacade() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.disco = new Disco();
    }

    public void ligarComputador() {
        cpu.iniciar();
        memoria.carregar();
        disco.ler();
    }
}

```

## Aula 07

### Strategy

- Objetivo
Definir uma família de algoritmos encapsulados e torná-los intercambiáveis em tempo de execução.

-  Motivação
Imagine que você tem um robô e quer que ele possa se mover de diferentes formas, dependendo da situação (modo rápido, modo furtivo, etc.). Com Strategy, você pode trocar o algoritmo sem alterar a classe principal.

```java
package src;

public class Disciplina {
     private String nome, situacao;
     private double p1, p2, media;
     private iMediaStrategy estrategia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }


    public Disciplina(iMediaStrategy estrategia){
         this.estrategia = estrategia;
    }

    public void calcularMedia(){
       media= estrategia.calcularMedia(p1,p2);
       situacao = estrategia.verificarSituacao(media);
    }

}
```

```java
package src;

public interface iMediaStrategy {
    double calcularMedia( double a, double b);
    String verificarSituacao(double media);

}
```

```java
package src;

public class Aritmetica implements iMediaStrategy{
    @Override
    public double calcularMedia(double a, double b) {
        return (a+b)/2;
    }

    @Override
    public String verificarSituacao(double media) {
        if (media>= 5)
            return "Aprovado";
        else
            return "Reprovado";
    }
}
```

```java
package src;

public class Geometrica implements iMediaStrategy{
    @Override
    public double calcularMedia(double a, double b) {
        return  Math.sqrt(a*b);
    }

    @Override
    public String verificarSituacao(double media) {
        if(media >= 7)
            return "Aprovado";
        else
            return "Reprovado";
    }
}
```

```java
package src;

public class Main {
        public static void main(String[] args) {
            iMediaStrategy estrategia = new Aritmetica();      // troque por new Geometrica()
            Disciplina d = new Disciplina(estrategia);

            d.setNome("Padrões de Desenvolvimento");
            d.setP1(10);
            d.setP2(5);
            d.calcularMedia();

            System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                    d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
        }
}
```

## Aula 08

### Teste de Software

#### 📌 Definição
> Teste é qualquer atividade que busca avaliar atributos ou capacidades de um sistema e verificar se os resultados atendem às expectativas.

---

#### 📖 Princípios do Teste

- **Revela a presença de defeitos, não sua ausência**
- **Teste 100% completo é impossível**
- **Teste deve ser antecipado e contínuo**
- **Defeitos se concentram em poucos módulos**
- **Paradoxo do pesticida**: testes precisam ser atualizados
- **Contexto influencia o processo de teste**
- **Deve atender às necessidades do cliente/usuário**
- **Teste é iterativo**
- **Automação é útil quando adequada**
- **Documentação e rastreabilidade são essenciais**

---

#### 🧪 Tipos de Testes

##### 🔧 Teste de Configuração ou Instalação
- Verifica o funcionamento em diferentes ambientes de hardware/software.
- Ex: Testar com pouca memória ou falha de rede.

##### 🧱 Teste de Integridade
- Avalia resistência a falhas e consistência de dados.
- Ex: Tabela com milhões de registros.

##### 🔐 Teste de Segurança
- Busca identificar vulnerabilidades e garantir acesso seguro.
- Ex: Resistência a ataques de força bruta.

##### ⚙️ Teste Funcional
- Verifica se os requisitos funcionais estão sendo atendidos.
- Ex: Atualização de perfil.

#####🧩 Teste de Unidade
- Testa componentes isoladamente (funções, métodos).
- Ex: Passar valores inválidos para uma função.

##### 🔗 Teste de Integração
- Testa a comunicação entre componentes.
- Ex: Login conectado ao banco de dados.

##### ⚡ Teste de Performance
- Avalia a resposta do sistema sob diferentes condições.
  - **Carga:** uso normal
  - **Stress:** uso extremo
  - **Estabilidade:** uso prolongado
- Ex: Milhares de usuários simultâneos.

##### 👤 Teste de Usabilidade
- Avalia a experiência do usuário e a interface.
- Ex: Posição intuitiva dos botões.

##### ♿ Teste de Acessibilidade
- Garante o uso por pessoas com deficiências.
- Ex: Navegação com leitores de tela.

##### 🔁 Teste de Regressão
- Garante que funcionalidades antigas ainda funcionam após mudanças.
- Ex: Revalidar funcionalidades após nova feature.

---

#### ⚪ Tipos de Teste por Acesso

##### 🧠 Teste de Caixa Branca
- Analista tem acesso ao código.
- Avalia a estrutura interna e permite testes precisos e focados.

##### 🕶️ Teste de Caixa Preta
- Analista não tem acesso ao código.
- Baseado nos requisitos funcionais.
- Ex: Campos obrigatórios não validados, botões sem ação.

---

# 🧪 Test Driven Development (TDD)

## 📌 O que é TDD?
- Metodologia onde os **testes são escritos antes da implementação**
- Cada teste funciona como uma **especificação executável**
- Processo **iterativo** com feedback constante

---

## 🎯 Objetivos de Aprendizagem
- Compreender o ciclo Red–Green–Refactor
- Dominar o fluxo do TDD
- Configurar ambiente com JUnit 5 / XUnit
- Aplicar TDD com exemplo prático (calculadora)
- Conhecer boas práticas e armadilhas comuns

---

## ✅ Benefícios do TDD
- **Redução de defeitos**
- **Feedback rápido**
- **Documentação viva**
- **Design orientado a requisitos**
- **Alta coesão e baixo acoplamento**

---

## 🔄 Ciclo Red – Green – Refactor

1. **Red**: Escreve teste que falha (define o requisito)
2. **Green**: Implementa código mínimo para passar o teste
3. **Refactor**: Refatora mantendo os testes funcionando

---

## ⚙️ Anatomia AAA de um Teste Unitário

- **Arrange**: Configura contexto e dados
- **Act**: Executa a operação testada
- **Assert**: Verifica se o resultado está correto

---

## 🔧 JUnit 5 – Anotações Essenciais

- `@Test`: Define método de teste
- `@BeforeEach`: Executa antes de cada teste
- `@AfterEach`: Executa após cada teste
- `@ParameterizedTest`: Permite múltiplos parâmetros
- `Assertions.*`: Métodos para validação (`assertEquals`, `assertThrows`)

---

## ✅ Boas Práticas

- Nome descritivo: `metodo_cenario_resultado`
- Preferir um `assert` por teste
- Testar **valores limítrofes**
- **Evitar dependência entre testes**

---

## 🧼 Resumo Final

- TDD leva a um **design limpo e testável**
- Feedback contínuo por meio do ciclo Red–Green–Refactor
- Ferramentas: **JUnit + IntelliJ (Java)** ou **XUnit + Visual Studio (C#)**


# 🏛️ Arquitetura MVC – Visão Geral

## 📌 Definição
- MVC = Model–View–Controller
- Separação de responsabilidades
- Proposto por **Trygve Reenskaug (1979)**

---

## ✅ Por que usar MVC?

- **Reduz acoplamento**
- **Permite trabalhos paralelos** (UI, lógica, controle)
- **Melhora testabilidade** (Model/Controller testáveis sem View)
- **Facilita evolução da interface** (Web, Mobile, CLI)

---

## 🔍 Componentes do MVC

### 🧠 Model
- Representa o **domínio da aplicação**
- Contém entidades, lógica de negócio e regras
- Mantém estado e **notifica mudanças à View**

### 👁️ View
- Responsável pela **apresentação**
- Exibe dados e coleta entrada do usuário
- **Sem lógica de negócio**
- Pode assumir várias formas: página, gráfico, API

### 🎮 Controller
- Intermediário entre **View e Model**
- Processa entradas do usuário (ex: HTTP)
- Define fluxo da aplicação
- Exemplo: `EmpréstimoController`

---

## 🔁 Ciclo de Interação

1. Usuário interage com a **View**
2. **Controller** interpreta e aciona o **Model**
3. **Model** altera o estado e emite evento
4. **View** atualiza a interface

---

## ⚖️ Benefícios e Desafios

### ✅ Benefícios:
- Separação clara
- Reutilização de código
- Testabilidade

### ❌ Desafios:
- Complexidade extra
- Gerência de dependências
- Overhead em projetos pequenos

---

## 🔄 Padrões Relacionados

- **MVC**: Base principal
- **MVP**: Presenter atualiza View diretamente
- **MVVM**: Data binding bidirecional
- Extensões: HMVC, PAC, Clean Architecture

---

## 🧩 Aplicações Reais

- **Web**: Spring MVC, ASP.NET MVC, Rails
- **Mobile**: SwiftUI + ViewModel
- **Desktop**: Qt, JavaFX
- Exemplo: E-commerce
  - Model: Carrinho
  - View: Página
  - Controller: Gerencia ações

---




