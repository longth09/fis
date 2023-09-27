package com.demo.account.domain.mapper;

import com.demo.account.api.dto.request.AccountRequestDto;
import com.demo.account.domain.model.Account;
import com.demo.account.domain.model.RoleDefinition;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-27T08:39:43+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IAccountRequestMapperImpl implements IAccountRequestMapper {

    @Override
    public Account to(AccountRequestDto obj) {
        if ( obj == null ) {
            return null;
        }

        Account account = new Account();

        account.setFirstName( obj.getFirstName() );
        account.setLastName( obj.getLastName() );
        account.setName( obj.getName() );
        account.setEmail( obj.getEmail() );
        account.setImageUrl( obj.getImageUrl() );
        account.setProvider( obj.getProvider() );
        account.setProviderId( obj.getProviderId() );
        List<RoleDefinition> list = obj.getRoles();
        if ( list != null ) {
            account.setRoles( new ArrayList<RoleDefinition>( list ) );
        }
        account.setActive( obj.isActive() );
        account.setCompanyName( obj.getCompanyName() );
        account.setJobTitle( obj.getJobTitle() );
        account.setSector( obj.getSector() );
        account.setCountry( obj.getCountry() );
        account.setWantToJoinWorkshop( obj.isWantToJoinWorkshop() );
        List<String> list1 = obj.getInterests();
        if ( list1 != null ) {
            account.setInterests( new ArrayList<String>( list1 ) );
        }

        return account;
    }

    @Override
    public AccountRequestDto from(Account obj) {
        if ( obj == null ) {
            return null;
        }

        AccountRequestDto accountRequestDto = new AccountRequestDto();

        accountRequestDto.setFirstName( obj.getFirstName() );
        accountRequestDto.setLastName( obj.getLastName() );
        accountRequestDto.setEmail( obj.getEmail() );
        accountRequestDto.setName( obj.getName() );
        accountRequestDto.setImageUrl( obj.getImageUrl() );
        accountRequestDto.setProvider( obj.getProvider() );
        accountRequestDto.setProviderId( obj.getProviderId() );
        List<RoleDefinition> list = obj.getRoles();
        if ( list != null ) {
            accountRequestDto.setRoles( new ArrayList<RoleDefinition>( list ) );
        }
        accountRequestDto.setActive( obj.isActive() );
        accountRequestDto.setCompanyName( obj.getCompanyName() );
        accountRequestDto.setJobTitle( obj.getJobTitle() );
        accountRequestDto.setSector( obj.getSector() );
        accountRequestDto.setCountry( obj.getCountry() );
        List<String> list1 = obj.getInterests();
        if ( list1 != null ) {
            accountRequestDto.setInterests( new ArrayList<String>( list1 ) );
        }
        accountRequestDto.setWantToJoinWorkshop( obj.isWantToJoinWorkshop() );

        return accountRequestDto;
    }

    @Override
    public List<Account> to(List<AccountRequestDto> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Account> list = new ArrayList<Account>( entities.size() );
        for ( AccountRequestDto accountRequestDto : entities ) {
            list.add( to( accountRequestDto ) );
        }

        return list;
    }

    @Override
    public List<AccountRequestDto> from(List<Account> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<AccountRequestDto> list = new ArrayList<AccountRequestDto>( dtos.size() );
        for ( Account account : dtos ) {
            list.add( from( account ) );
        }

        return list;
    }

    @Override
    public Set<Account> to(Set<AccountRequestDto> entities) {
        if ( entities == null ) {
            return null;
        }

        Set<Account> set = new HashSet<Account>( Math.max( (int) ( entities.size() / .75f ) + 1, 16 ) );
        for ( AccountRequestDto accountRequestDto : entities ) {
            set.add( to( accountRequestDto ) );
        }

        return set;
    }

    @Override
    public Set<AccountRequestDto> from(Set<Account> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<AccountRequestDto> set = new HashSet<AccountRequestDto>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( Account account : dtos ) {
            set.add( from( account ) );
        }

        return set;
    }

    @Override
    public Account merge(Account target, Account source) {
        if ( source == null ) {
            return null;
        }

        target.setCreatedDate( source.getCreatedDate() );
        target.setUpdatedDate( source.getUpdatedDate() );
        target.setFirstName( source.getFirstName() );
        target.setLastName( source.getLastName() );
        target.setName( source.getName() );
        target.setEmail( source.getEmail() );
        target.setImageUrl( source.getImageUrl() );
        target.setEmailVerified( source.getEmailVerified() );
        target.setPassword( source.getPassword() );
        target.setProvider( source.getProvider() );
        target.setProviderId( source.getProviderId() );
        if ( target.getRoles() != null ) {
            List<RoleDefinition> list = source.getRoles();
            if ( list != null ) {
                target.getRoles().clear();
                target.getRoles().addAll( list );
            }
            else {
                target.setRoles( null );
            }
        }
        else {
            List<RoleDefinition> list = source.getRoles();
            if ( list != null ) {
                target.setRoles( new ArrayList<RoleDefinition>( list ) );
            }
        }
        target.setActive( source.isActive() );
        target.setCompanyName( source.getCompanyName() );
        target.setJobTitle( source.getJobTitle() );
        target.setSector( source.getSector() );
        target.setCountry( source.getCountry() );
        target.setWantToJoinWorkshop( source.isWantToJoinWorkshop() );
        if ( target.getInterests() != null ) {
            List<String> list1 = source.getInterests();
            if ( list1 != null ) {
                target.getInterests().clear();
                target.getInterests().addAll( list1 );
            }
            else {
                target.setInterests( null );
            }
        }
        else {
            List<String> list1 = source.getInterests();
            if ( list1 != null ) {
                target.setInterests( new ArrayList<String>( list1 ) );
            }
        }

        return target;
    }
}
