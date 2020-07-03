# Disponível em

[Desvendando a variável _this_ no JavaScript (Rocketseat)](https://www.youtube.com/watch?v=GSqR2i-Pq6o)

---

## O que é "this"

`this`, em inglês ,significa: `isto, esta, este`

Precisamos estar situados em algum contexto para entender o `this`. O comportamento dele depende do contexto `context` ou do escopo `scope`.

_"O contexto (this) representa um objeto em questão e não a função. A função tem um contexto se ela estiver dentro de um objeto ou se você passar um contexto pra ela como no call, bind e apply, do contrário this é undefined. O this é atribuído ao objeto na Creation Phase do contexto de execução. Você consegue acessar o this em uma função em um contexto global, seja browser ou ambiente node, porque existe também um objeto global tanto para o browser (window) quanto para o node. (Global Object). Mas o contexto refere-se ao objeto e não a função."_

O comportamento do `this` depende, então do:

1. Escopo e Contexto
2. Modo Estrito

---

### 1 Escopo vs Contexto

- Escopo (scope)

  - **Acesso** às variáveis, funções e objetos numa parte do código, durante o tempo de execução.
  - Determina a **visibilidade** desses recursos em alguma parte do código.
  - Sempre invocamos uma função, estamos criando um novo `scope`

- Contexto (context)

  - Enquanto o `scope` se refere às diversas variáveis, o `context` se refere ao valor do `this` no mesmo `scope`
  - Pode ser mudado com funções especiais como: .apply(), .call() e .bind()
  - No contexto de execução `execution context` o contexto já não é mais esse contexto que estamos discutindo. Ele será o `scope`

Temos 2 `scopes`:

1. Global
   1. No momento que começamos a escrever código, estamos nesse contexto.
   2. Existe enquanto existir a aplicação
2. Local
   1. Dentro de alguma função, variáveis estão no escopo (contexto) local.
   2. Existe equanto existir a função ou o objeto.

### 2 Modo Estrito (strict mode)

- Muda a semântica do JavaScript
- É opcional
- `"use strict"` para habilitar no contexto
- Elimina alguns erros silenciosos
- Evita algumas confusões
- Proíbe algumas sintaxes
