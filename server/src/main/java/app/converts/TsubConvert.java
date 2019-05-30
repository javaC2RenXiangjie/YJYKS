package app.converts;

import app.dtos.TsubDTO;
import app.entities.TsubEntity;
import org.springframework.stereotype.Service;

@Service
public class TsubConvert {
    /**
     * tsubEntity convert to dto
     * @param tsubEntity
     * @return
     */
    public TsubDTO tsubEntityConvertToDTO(TsubEntity tsubEntity) {
        TsubDTO tsubDTO = new TsubDTO();
        tsubDTO.setId(tsubEntity.getId());
        tsubDTO.setSubject(tsubEntity.getSubject());
        tsubDTO.setAddTime(tsubEntity.getAddTime());
        tsubDTO.setOwner(tsubEntity.getOwner());
        return tsubDTO;
    }

    public TsubEntity tsubDTOConvertToEntity(TsubDTO tsubDTO) {
        TsubEntity tsubEntity = new TsubEntity();
        tsubEntity.setId(tsubDTO.getId());
        tsubEntity.setSubject(tsubDTO.getSubject());
        tsubEntity.setAddTime(tsubDTO.getAddTime());
        tsubEntity.setOwner(tsubDTO.getOwner());
        return tsubEntity;
    }
}
