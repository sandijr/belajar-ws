/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.peserta.service.impl.dummy;

import aplikasi.peserta.domain.Peserta;
import aplikasi.peserta.service.ManajemenPesertaService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author brainmatics
 */
public class ManajemenPesertaServiceDummy implements ManajemenPesertaService {
    
    private Map<Integer, Peserta> dbPalsu = new TreeMap<Integer, Peserta>();
    @Override
    public void simpan(Peserta p) {
        if((p.getId()) == null){
            p.setId(dbPalsu.size());
        }
        dbPalsu.put(p.getId(), p);
    }

    @Override
    public Peserta findPesertById(Integer Id) {
        return dbPalsu.get(Id);
    }

    @Override
    public Peserta findPesertByNomorPeserta(String no) {
         List<Peserta> hasil = new ArrayList<Peserta>();
        for (Integer i : dbPalsu.keySet()){
            Peserta p = dbPalsu.get(i);
            if (p.getNomorPeserta().equals(no)){
                 return p;
            }
             
        }
        return null;
    }

    @Override
    public List<Peserta> findSemuaPeserta(Integer start, Integer rows) {
        List<Peserta> hasil = new ArrayList<Peserta>();
        for (Integer i : dbPalsu.keySet()){
            Peserta p = dbPalsu.get(i);
            hasil.add(p);
        }
        return hasil;
    }

    @Override
    public Long countsemuaPeserta() {
        return new Long(dbPalsu.size());
    }
    
}
