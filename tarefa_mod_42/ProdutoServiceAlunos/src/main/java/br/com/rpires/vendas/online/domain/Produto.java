package br.com.rpires.vendas.online.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.math.BigDecimal;

@Document(collection = "produto")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@Schema(name="Produto", description="Produto")
public class Produto {

	@Id
	@Schema(description="Identificador único")
	private String id;

	@NotNull
	@Size(min = 2, max = 10)
	@Indexed(unique = true, background = true)
	@Schema(description="Código do produto", nullable = false)
	private String codigo;

	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="Nome", nullable = false)
	private String nome;

	@NotNull
	@Schema(description="Valor", nullable = false)
	private BigDecimal valor;
}

