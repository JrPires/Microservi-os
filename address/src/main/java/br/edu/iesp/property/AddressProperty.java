package br.edu.iesp.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("addresss")
@RefreshScope
@Data
@Getter
@Setter
public class AddressProperty {

	private String messageNotFound;
}
