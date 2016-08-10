package nl.matsv.paaaas.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MinecraftData {
    private MinecraftLatest minecraftLatest;
    private List<MinecraftVersion> versions;


}

