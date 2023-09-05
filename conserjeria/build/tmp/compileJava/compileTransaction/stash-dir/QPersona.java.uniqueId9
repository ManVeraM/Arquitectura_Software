package cl.ucn.disc.as.model.query;

import cl.ucn.disc.as.model.Persona;
import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.Generated;
import io.ebean.typequery.PInstant;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Persona.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QPersona extends TQRootBean<Persona,QPersona> {

  private static final QPersona _alias = new QPersona(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QPersona alias() {
    return _alias;
  }

  public PLong<QPersona> id;
  public PLong<QPersona> version;
  public PInstant<QPersona> created;
  public PInstant<QPersona> modified;
  public PInteger<QPersona> rut;
  public PString<QPersona> nombre;
  public PString<QPersona> apellidos;
  public PString<QPersona> email;
  public PString<QPersona> telefono;


  /**
   * Return a query bean used to build a FetchGroup.
   * <p>
   * FetchGroups are immutable and threadsafe and can be used by many
   * concurrent queries. We typically stored FetchGroup as a static final field.
   * <p>
   * Example creating and using a FetchGroup.
   * <pre>{@code
   * 
   * static final FetchGroup<Customer> fetchGroup = 
   *   QCustomer.forFetchGroup()
   *     .shippingAddress.fetch()
   *     .contacts.fetch()
   *     .buildFetchGroup();
   * 
   * List<Customer> customers = new QCustomer()
   *   .select(fetchGroup)
   *   .findList();
   * 
   * }</pre>
   */
  public static QPersona forFetchGroup() {
    return new QPersona(FetchGroup.queryFor(Persona.class));
  }

  /**
   * Construct using the default Database.
   */
  public QPersona() {
    super(Persona.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QPersona(Transaction transaction) {
    super(Persona.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QPersona(Database database) {
    super(Persona.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QPersona(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QPersona(Query<Persona> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QPersona> id = _alias.id;
    public static PLong<QPersona> version = _alias.version;
    public static PInstant<QPersona> created = _alias.created;
    public static PInstant<QPersona> modified = _alias.modified;
    public static PInteger<QPersona> rut = _alias.rut;
    public static PString<QPersona> nombre = _alias.nombre;
    public static PString<QPersona> apellidos = _alias.apellidos;
    public static PString<QPersona> email = _alias.email;
    public static PString<QPersona> telefono = _alias.telefono;
  }
}
